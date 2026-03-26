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
public class Notification {
    private MessageService messageService;

    // Setter Injection
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send(String message) {
        if (this.messageService == null) {
            System.out.println("Message service not set!");
            return;
        }
        messageService.sendMessage(message);
    }
}
