/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BookCategoryDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BookCategoryService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BookCategoryController {
 private BookCategoryService bookCategoryService = (BookCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BOOKCATEGORY);
      public String save(BookCategoryDto bookCategoryDto) throws Exception{
         return bookCategoryService.save(bookCategoryDto);
    }

    public String update(BookCategoryDto bookCategoryDto) throws Exception{
       return bookCategoryService.update(bookCategoryDto);
    }

    public String delete(String bookId) throws Exception{
        return bookCategoryService.delete(bookId);
    }

    public BookCategoryDto get(String bookId) throws Exception{
        return bookCategoryService.get(bookId);
    }

    public ArrayList<BookCategoryDto> getAll() throws Exception{
       return bookCategoryService.getAll();
    }
}
