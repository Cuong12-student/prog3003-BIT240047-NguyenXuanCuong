/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author VICTUS
 */
import service.Notification;
public class ConstructorInjectionApp {
    private final Notification notification;
    public ConstructorInjectionApp(Notification notification){
        this.notification=notification;
    }
    public void printMessage(String message){
        notification.notifyUser(message);
    }
}
