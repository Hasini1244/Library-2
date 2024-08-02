/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BookCategoryDao;
import edu.ijse.entity.BookCategoryEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class BookCategoryDaoImpl implements BookCategoryDao{

    @Override
    public String save(BookCategoryEntity t) throws Exception {
boolean isSaved = CrudUtil.executeUpdate("INSERT INTO bookCategory VALUES(?,?,?)", 
                t.getBookId(), t.getLanguage(), t.getBookCategory());
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(BookCategoryEntity t) throws Exception {
boolean isUpdated = CrudUtil.executeUpdate("UPDATE bookCategory SET Language=?, BookCategory=? WHERE BookId =?",
                t.getLanguage(), t.getBookCategory(),t.getBookId());
        return isUpdated ? "Success" : "Fail";    }

    @Override
    public String delete(String id) throws Exception {
boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM bookCategory WHERE BookId =?", id);
        return isDeleted ? "Success" : "Fail";    }

    @Override
    public BookCategoryEntity get(String id) throws Exception {
ResultSet rst = CrudUtil.executeQuery("SELECT * FROM bookCategory WHERE BookId =?", id);
        if (rst.next()) {
            return new BookCategoryEntity(rst.getString("BookId"), rst.getString("Language"),
                    rst.getString("BookCategory"));
        }
           return null;    }

    @Override
    public ArrayList<BookCategoryEntity> getAll() throws Exception {
ArrayList<BookCategoryEntity> bookCategoryEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM BookCategory");
        while (rst.next()) {
            BookCategoryEntity entity = new BookCategoryEntity(rst.getString("BookId"), rst.getString("Language"), rst.getString("BookCategory"));
            bookCategoryEntitys.add(entity);
        }

        return bookCategoryEntitys;    }
    
}
