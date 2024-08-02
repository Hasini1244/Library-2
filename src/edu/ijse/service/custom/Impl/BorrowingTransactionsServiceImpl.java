/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.Impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dao.custom.BorrowDetailDao;
import edu.ijse.dao.custom.BorrowingTransactionsDao;
import edu.ijse.db.DBConnection;
import edu.ijse.dto.BorrowDetailDto;
import edu.ijse.dto.BorrowingTransactionsDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.entity.BorrowDetailEntity;
import edu.ijse.entity.BorrowingTransactionsEntity;
import edu.ijse.service.custom.BorrowingTransactionsService;
import java.sql.Connection;
/**
 *
 * @author USER
 */
public class BorrowingTransactionsServiceImpl implements BorrowingTransactionsService{
    private BorrowingTransactionsDao borrowingTransactionsDao=(BorrowingTransactionsDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BorrowingTransactions);
  private BorrowDetailDao borrowDetailDao = (BorrowDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BORROW_DETAIL);
  private BookDao bookDao=(BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);
        
        @Override
        
    public String Place(BorrowingTransactionsDto borrowingTransactionsDto) throws Exception {
        
       Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

   BorrowingTransactionsEntity borrowingTransactionsEntity = new BorrowingTransactionsEntity(borrowingTransactionsDto.getBorrowingId(), borrowingTransactionsDto.getDate(), borrowingTransactionsDto.getMemberId(),borrowingTransactionsDto.getDueDate());
            String resp = borrowingTransactionsDao.save(borrowingTransactionsEntity);
            if(resp.equals("Success")){

                boolean isBorrowDetailSave = true;

                    for (BorrowDetailDto borrowDetailDto : borrowingTransactionsDto.getBorrowDetailDtos()) {
                    BorrowDetailEntity borrowDetailEntity = new BorrowDetailEntity(borrowingTransactionsDto.getBorrowingId(),
                            borrowDetailDto.getBookId(), borrowDetailDto.getQty());
                           
                    String boResp = borrowDetailDao.save(borrowDetailEntity);
                    if(!boResp.equals("Success")){
                        isBorrowDetailSave = false;
                    }
                }
                
                if(isBorrowDetailSave){
                    boolean isBookUpdated = true;
                    
                    for (BorrowDetailDto borrowDetailDto : borrowingTransactionsDto.getBorrowDetailDtos()) {
                        BookEntity bookEntity = bookDao.get(borrowDetailDto.getBookId());
                        bookEntity.setnumber(bookEntity.getnumber() - borrowDetailDto.getQty());
                        String bookResp = bookDao.update(bookEntity);
                        if(!bookResp.equals("Success")){
                            isBookUpdated = false;
                        }
                    }
                    
                    if(isBookUpdated){
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Book update Error";
                    }
                    
                } else{
                    connection.rollback();
                    return "Borrow Detail Save Error";
                }
                
            } else {
                connection.rollback();
                return "Borrow Save Error";
            }
            
        } catch (Exception e) {
           connection.rollback();
           e.printStackTrace();
           return "Server Error";
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public String gets(String id) throws Exception {
  String entity = borrowingTransactionsDao.gets(id);
 
    String dto=(entity);
    
    return dto;    
    }
    
}
