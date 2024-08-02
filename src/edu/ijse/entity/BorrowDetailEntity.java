/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author USER
 */
public class BorrowDetailEntity {
    private String borrowId;
    private String BookId ;
    private Integer qty;

    public BorrowDetailEntity() {
    }

    public BorrowDetailEntity(String borrowId, String BookId, Integer qty) {
        this.borrowId = borrowId;
        this.BookId = BookId;
        this.qty = qty;
    }

    /**
     * @return the borrowId
     */
    public String getBorrowId() {
        return borrowId;
    }

    /**
     * @param borrowId the borrowId to set
     */
    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
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
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BorrowDetailEntity{" + "borrowId=" + borrowId + ", BookId=" + BookId + ", qty=" + qty + '}';
    }
    
}
