/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.dto;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class BorrowingTransactionsDto {
   private String borrowingId;
    private String date;
    private String MemberId;
 private String dueDate;
private ArrayList<BorrowDetailDto> borrowDetailDtos;

    public BorrowingTransactionsDto() {
    }

    public BorrowingTransactionsDto(String borrowingId, String date, String MemberId,String dueDate, ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.borrowingId = borrowingId;
        this.date = date;
        this.MemberId = MemberId;
        this.borrowDetailDtos = borrowDetailDtos;
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
        this.borrowingId = borrowingId;
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
     * @return the MemberId
     */
    public String getMemberId() {
        return MemberId;
    }

    /**
     * @param MemberId the MemberId to set
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
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

    /**
     * @return the borrowDetailDtos
     */
    public ArrayList<BorrowDetailDto> getBorrowDetailDtos() {
        return borrowDetailDtos;
    }

    /**
     * @param borrowDetailDtos the borrowDetailDtos to set
     */
    public void setBorrowDetailDtos(ArrayList<BorrowDetailDto> borrowDetailDtos) {
        this.borrowDetailDtos = borrowDetailDtos;
    }

    @Override
    public String toString() {
        return "BorrowingTransactionsDto{" + "borrowingId=" + borrowingId + ", date=" + date + ", MemberId=" + MemberId + ", dueDate=" + dueDate + ", borrowDetailDtos=" + borrowDetailDtos + '}';
    }

}