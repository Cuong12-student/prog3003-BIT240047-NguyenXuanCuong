/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author VICTUS
 */
import service.*;
public class NotificationFactory {
    public Notification createNotification(String channel){
        if(channel.isEmpty()){
            return null;
        }
        if(channel.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }else if(channel.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        return null;
    }
}
