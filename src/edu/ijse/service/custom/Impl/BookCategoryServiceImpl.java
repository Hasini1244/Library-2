/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.service.custom.Impl;

import edu.ijse.dao.DaoFactory;
import edu.ijse.dao.custom.BookCategoryDao;
import edu.ijse.dto.BookCategoryDto;
import edu.ijse.entity.BookCategoryEntity;
import edu.ijse.service.custom.BookCategoryService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BookCategoryServiceImpl implements BookCategoryService{
 private BookCategoryDao bookCategoryDao = (BookCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.BOOKCATEGORY);

    @Override
    public String save(BookCategoryDto dto) throws Exception {
      BookCategoryEntity entity = getBookCategoryEntity(dto);
        return bookCategoryDao.save(entity);
    }

    @Override
    public String update(BookCategoryDto dto) throws Exception {
        BookCategoryEntity entity = getBookCategoryEntity(dto);
        return bookCategoryDao.update(entity);
    }

    @Override
    public String delete(String bookId) throws Exception {
        return bookCategoryDao.delete(bookId);
    }

     @Override
    public BookCategoryDto get(String bookId) throws Exception {
       BookCategoryEntity entity = bookCategoryDao.get(bookId);
       if(entity!=null){
        return getBookCategoryDto(entity);
       }
       return null;
    }

    @Override
    public ArrayList<BookCategoryDto> getAll() throws Exception {
       ArrayList<BookCategoryDto> bookCategoryDtos = new ArrayList<>();
        ArrayList<BookCategoryEntity> bookCategoryEntitys = bookCategoryDao.getAll();
        for (BookCategoryEntity bookCategoryEntity : bookCategoryEntitys) {
            BookCategoryDto dto = getBookCategoryDto(bookCategoryEntity);
            bookCategoryDtos.add(dto);
        }
        return bookCategoryDtos;
    }

    private BookCategoryDto getBookCategoryDto(BookCategoryEntity entity){
        BookCategoryDto bookCategoryDto = new BookCategoryDto(entity.getBookId(),
                entity.getLanguage(),
                entity.getBookCategory());
        return bookCategoryDto;
    }

    private BookCategoryEntity getBookCategoryEntity(BookCategoryDto dto){
         BookCategoryEntity entity = new BookCategoryEntity(dto.getBookId(),dto.getLanguage(),
                dto.getBookCategory());
         return entity;
    }

    
}
