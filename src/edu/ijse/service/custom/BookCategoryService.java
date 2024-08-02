/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BookCategoryDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface BookCategoryService extends SuperService{
    public String save(BookCategoryDto dto) throws Exception;
    public String update(BookCategoryDto dto) throws Exception;
    public String delete(String bookId) throws Exception;
    public BookCategoryDto get(String bookId) throws Exception;
    public ArrayList<BookCategoryDto> getAll() throws Exception;
}
