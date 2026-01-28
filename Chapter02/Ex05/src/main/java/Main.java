/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import Service.*;
import notification.Notification;
public class Main {

    public static void main(String[] args) {
        Notification n=new Notification();
        n.setMessageService(new EmailService());
        n.send("Xin chao");
        n.setMessageService(new SMSService());
        n.send("Hello world");
    }
}
