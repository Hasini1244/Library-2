/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.service.custom;

import edu.ijse.dto.ReturnDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface ReturnService extends SuperService{
    public String Place(ReturnDto returnDto) throws Exception;
}
