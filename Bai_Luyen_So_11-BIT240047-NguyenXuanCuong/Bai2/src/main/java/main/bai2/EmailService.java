/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bai2;

import main.bai2.MessageService;

/**
 *
 * @author VICTUS
 */
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String e){
        System.out.println("Gui emai:"+e);
    }
}
