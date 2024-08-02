/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao;

import edu.ijse.dao.custom.Impl.BookDaoImpl;
import edu.ijse.dao.custom.Impl.BookCategoryDaoImpl;
import edu.ijse.dao.custom.Impl.BorrowDetailDaoImpl;
import edu.ijse.dao.custom.Impl.BorrowingTransactionsDaoImpl;
import edu.ijse.dao.custom.Impl.MemberDaoImpl;
import edu.ijse.dao.custom.Impl.ReturnDaoImpl;
import edu.ijse.dao.custom.Impl.ReturnDetailDaoImpl;

/**
 *
 * @author USER
 */
public class DaoFactory {
     private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case BOOK:
                return new BookDaoImpl();
                 case MEMBER:
                return new MemberDaoImpl();
            case BOOKCATEGORY:
                return new BookCategoryDaoImpl();
                 case BorrowingTransactions:
                return new BorrowingTransactionsDaoImpl();
                 case BORROW_DETAIL:
                return new BorrowDetailDaoImpl();
                 case Return:
                return new ReturnDaoImpl();
                 case RETURN_DETAIL:
                return new ReturnDetailDaoImpl();
                
            default:
                return null;
        }
    }

    public enum DaoTypes{
      BOOK,MEMBER,BOOKCATEGORY,BorrowingTransactions,Return,BORROW_DETAIL,RETURN_DETAIL;
    }
}
