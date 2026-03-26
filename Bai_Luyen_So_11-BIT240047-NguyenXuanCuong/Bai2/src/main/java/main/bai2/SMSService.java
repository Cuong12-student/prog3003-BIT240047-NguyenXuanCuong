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
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String s){
        System.out.println("Gui SMS:"+s);
    }
}
