/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.Impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dao.custom.ReturnDao;
import edu.ijse.dao.custom.ReturnDetailDao;
import edu.ijse.db.DBConnection;
import edu.ijse.dto.ReturnDetailDto;
import edu.ijse.dto.ReturnDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.entity.ReturnDetailEntity;
import edu.ijse.entity.ReturnEntity;
import edu.ijse.service.custom.ReturnService;
import java.sql.Connection;
/**
 *
 * @author USER
 */
public class ReturnServiceImpl implements ReturnService{
private ReturnDao returnDao=(ReturnDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.Return);
    private ReturnDetailDao returnDetailDao = (ReturnDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.RETURN_DETAIL);
    private BookDao bookDao=(BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String Place(ReturnDto returnDto) throws Exception {
Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            
  ReturnEntity returnEntity = new ReturnEntity(returnDto.getReturnId(), returnDto.getDate(), returnDto.getMemberId(),returnDto.getFine());            
            String resp = returnDao.save(returnEntity);
            if(resp.equals("Success")){
                
                boolean isReturnDetailSave = true;
                
                for (ReturnDetailDto returnDetailDto : returnDto.getReturnDetailDtos()) {
                    ReturnDetailEntity returnDetailEntity = new ReturnDetailEntity(returnDto.getReturnId(),
                            returnDetailDto.getBookId(), returnDetailDto.getQty());
                           
                    String reResp = returnDetailDao.save(returnDetailEntity);
                    if(!reResp.equals("Success")){
                        isReturnDetailSave = false;
                    }
                }
                
                if(isReturnDetailSave){
                    boolean isBookUpdated = true;
                    
                    for (ReturnDetailDto returnDetailDto : returnDto.getReturnDetailDtos()) {
                        BookEntity bookEntity = bookDao.get(returnDetailDto.getBookId());
                        bookEntity.setnumber(bookEntity.getnumber() + returnDetailDto.getQty());
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
                    return "Return Detail Save Error";
                }
                
            } else {
                connection.rollback();
                return "Return Save Error";
            }
            
        } catch (Exception e) {
           connection.rollback();
           e.printStackTrace();
           return "Server Error";
        } finally {
            connection.setAutoCommit(true);
        }
        
    }
    
}