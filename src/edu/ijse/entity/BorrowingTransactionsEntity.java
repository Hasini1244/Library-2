/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.entity;

/**
 *
 * @author USER
 */
public class BorrowingTransactionsEntity {
  private String borrowingId;
    private String date;
    private String memberId;
    private String dueDate;
    
     public BorrowingTransactionsEntity() {
    }

    public BorrowingTransactionsEntity(String borrowingId, String date, String memberId, String dueDate) {
        this.borrowingId = borrowingId;
        this.date = date;
        this.memberId = memberId;
        this.dueDate = dueDate;
    }

    /**
     * @return the borrowingId
     */
    public String getBorrowingId() {
        return borrowingId;
    }

    /**
     * @param borrowingId the borrowingId to set
     */
    public void setBorrowingId(String borrowingId) {
        this.borrowingId= borrowingId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

   

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }
     /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BorrowingTransactionsEntity{" + "borrowingId=" + borrowingId + ", date=" + date + ", memberId=" + memberId + ", dueDate=" + dueDate + '}';
    }
    
}
