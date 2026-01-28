/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notification;

/**
 *
 * @author VICTUS
 */
import Service.MessageService;
public class Notification {
    private MessageService ms;
    public void setMessageService(MessageService ms){
        this.ms=ms;
    }
    public void send(String message){
        ms.sendMessage(message);
    }
}
