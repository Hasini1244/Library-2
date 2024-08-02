/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.Impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookDao;
import edu.ijse.dto.BookDto;
import edu.ijse.entity.BookEntity;
import edu.ijse.service.custom.BookService;
import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class BookServiceImpl implements BookService{
 private BookDao bookDao = (BookDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOK);

    @Override
    public String save(BookDto dto) throws Exception {
      BookEntity entity = getBookEntity(dto);
        return bookDao.save(entity);
    }

    @Override
    public String update(BookDto dto) throws Exception {
        BookEntity entity = getBookEntity(dto);
        return bookDao.update(entity);
    }

    @Override
    public String delete(String bookId) throws Exception {
        return bookDao.delete(bookId);
    }

     @Override
    public BookDto get(String bookId) throws Exception {
       BookEntity entity = bookDao.get(bookId);
       if(entity!=null){
        return getBookDto(entity);
       }
       return null;
    }

    @Override
    public ArrayList<BookDto> getAll() throws Exception {
       ArrayList<BookDto> bookDtos = new ArrayList<>();
        ArrayList<BookEntity> bookEntitys = bookDao.getAll();
        for (BookEntity bookEntity : bookEntitys) {
            BookDto dto = getBookDto(bookEntity);
            bookDtos.add(dto);
        }
        return bookDtos;
    }

    private BookDto getBookDto(BookEntity entity){
        BookDto bookDto = new BookDto(entity.getBookId(),
                entity.getName(),
                entity.getAuthor(), entity.getnumber(), entity.getPrice());
        return bookDto;
    }

    private BookEntity getBookEntity(BookDto dto){
         BookEntity entity = new BookEntity(dto.getBookId(), dto.getName(),dto.getAuthor(), dto.getnumber(), dto.getPrice());
         return entity;
    }

    
}
