/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.controller;

import edu.ijse.dto.ReturnDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.ReturnService;

/**
 *
 * @author USER
 */
public class ReturnController {
      private ReturnService returnService = (ReturnService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.Return);
    
    public String Place(ReturnDto returnDto) throws Exception{
        return returnService.Place(returnDto);
    }
   
}