/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BorrowingTransactionsDao;
import edu.ijse.entity.BorrowingTransactionsEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class BorrowingTransactionsDaoImpl implements BorrowingTransactionsDao{

    @Override
    public String save(BorrowingTransactionsEntity t) throws Exception {
 boolean isBorrowingTransactionsSaved = CrudUtil.executeUpdate("INSERT INTO BorrowingTransactions VALUES (?,?,?,?)", t.getBorrowingId(), t.getDate(), t.getMemberId(),t.getDueDate());
        return isBorrowingTransactionsSaved? "Success" : "Fail";    }

    @Override
    public String update(BorrowingTransactionsEntity t) throws Exception {
return null;
    }

    @Override
    public String delete(String id) throws Exception {
return null;
    }

    @Override
    public BorrowingTransactionsEntity get(String id) throws Exception {
return null;
    }

    @Override
    public ArrayList<BorrowingTransactionsEntity> getAll() throws Exception {
return null;
    }
     public String gets(String id) throws Exception {
         ResultSet rst = CrudUtil.executeQuery("SELECT DueDate FROM borrowingTransactions WHERE BorrowingID  =?", id);
        if (rst.next()) {
            return (rst.getString("DueDate"));
                   
        }
        return null;
    }

    
}
