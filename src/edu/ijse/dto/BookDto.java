/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

/**
 *
 * @author USER
 */
public class BookDto {

    private String BookId;
    private String Name;
    private String Author;
    private Integer number;
    private Double Price;
   
     public BookDto() {
    }

    public BookDto(String BookId, String Name, String Author, Integer number, Double Price) {
        this.BookId = BookId;
        this.Name= Name;
        this.Author = Author;
        this.number = number;
        this.Price = Price;
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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @param Author the Author to set
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * @return the number
     */
    public Integer getnumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setnumber(Integer number) {
        this.number = number;
    }

    /**
     * @return the Price
     */
    public Double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "BookDto{" + "BookId=" + BookId + ", Name=" + Name + ", Author=" + Author + ", number=" + number + ", Price=" + Price + '}';
    }
   
}
