/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author USER
 */
public class BookCategoryDto {
    private String BookId;
     private String Language;
      private String BookCategory;
      
      
       public BookCategoryDto() {
       }

    public BookCategoryDto(String BookId, String Language, String BookCategory){
        this.BookId = BookId;
        this.Language= Language;
                this.BookCategory= BookCategory;
    }

    /**
     * @return the BookId
     */
    public String getBookId() {
        return BookId;
    }

    /**
     * @param BookId the BookId to set
     */
    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    /**
     * @return the Language
     */
    public String getLanguage() {
        return Language;
    }

    /**
     * @param Language the Language to set
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * @return the BookCategory
     */
    public String getBookCategory() {
        return BookCategory;
    }

    /**
     * @param BookCategory the BookCategory to set
     */
    public void setBookCategory(String BookCategory) {
        this.BookCategory = BookCategory;
    }

    @Override
    public String toString() {
        return "BookCategoryDto{" + "BookId=" + BookId + ", Language=" + Language + ", BookCategory=" + BookCategory + '}';
    }
    
}
    
    

