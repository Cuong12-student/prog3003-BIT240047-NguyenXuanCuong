/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
import service.*;
import app.ConstructorInjectionApp;
public class Main {
    public static void main(String[] args){
        NotificationFactory nf=new NotificationFactory();
        Notification notification1=nf.createNotification("SMS");
        if(notification1!=null){
            ConstructorInjectionApp app=new ConstructorInjectionApp(notification1);
            app.printMessage("Thanh cong");
        }
        Notification notification2=nf.createNotification("Email");
        if(notification2!=null){
            ConstructorInjectionApp app=new ConstructorInjectionApp(notification2);
            app.printMessage("Thanh cong");
        }
    }
}
