/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.BorrowingTransactionsDto;
import edu.ijse.service.SuperService;

/**
 *
 * @author USER
 */
public interface BorrowingTransactionsService extends SuperService{
    public String Place(BorrowingTransactionsDto borrowingTransactionsDto) throws Exception;
      public String gets(String id) throws Exception;

}
