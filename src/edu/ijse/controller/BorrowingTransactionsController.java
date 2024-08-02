/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.BorrowingTransactionsDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.BorrowingTransactionsService;

/**
 *
 * @author USER
 */
public class BorrowingTransactionsController {
  
 private BorrowingTransactionsService borrowingTransactionsService = (BorrowingTransactionsService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.BorrowingTransactions);

    public String Place(BorrowingTransactionsDto borrowingTransactionsDto) throws Exception{
        return borrowingTransactionsService.Place(borrowingTransactionsDto);
    }
 
  public String gets (String id) throws Exception{
        return borrowingTransactionsService.gets(id);
    }
}

