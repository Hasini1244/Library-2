/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dao.custom.Impl;

import edu.ijse.dao.CrudUtil;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.entity.BookEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
/**
 *
 * @author USER
 */
public class BookDaoImpl implements BookDao{

    @Override
    public String save(BookEntity t) throws Exception {
boolean isSaved = CrudUtil.executeUpdate("INSERT INTO book VALUES(?,?,?,?,?)", 
                t.getBookId(), t.getName(), t.getAuthor(),
                 t.getnumber(),t.getPrice());
        return isSaved ? "Success" : "Fail";
    }
    @Override
    public String update(BookEntity t) throws Exception {
boolean isUpdated = CrudUtil.executeUpdate("UPDATE book SET Name=?, Author=?, number = ?, Price=? WHERE BookId =?",
                t.getName(), t.getAuthor(),
                t.getnumber(), t.getPrice(), t.getBookId());
        return isUpdated ? "Success" : "Fail";
    }
    

    @Override
    public String delete(String id) throws Exception {
boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM book WHERE BookId =?", id);
        return isDeleted ? "Success" : "Fail";
        }

    @Override
    public BookEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM book WHERE BookId =?", id);
        if (rst.next()) {
            return new BookEntity(rst.getString("BookId"), rst.getString("Name"),
                    rst.getString("Author"), rst.getInt("number"), rst.getDouble("Price"));
        }
           return null;
    }  

    @Override
    public ArrayList<BookEntity> getAll() throws Exception {
 ArrayList<BookEntity> bookEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Book");
        while (rst.next()) {
            BookEntity entity = new BookEntity(rst.getString("BookId"), rst.getString("Name"),
                    rst.getString("Author"), rst.getInt("number"), rst.getDouble("Price"));
            bookEntitys.add(entity);
        }

        return bookEntitys;
    }
}

    

