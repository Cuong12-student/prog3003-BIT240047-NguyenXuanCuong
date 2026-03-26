/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.bai2;

/**
 *
 * @author VICTUS
 */
public class Bai2 {

    public static void main(String[] args) {
        Notification notification = new Notification();
        String msg = "Chào mừng bạn đến với hệ thống!";

        // Demo gửi qua Email
        notification.setMessageService(new EmailService());
        notification.send(msg);

        // Demo gửi qua SMS (Thay đổi hành vi lúc runtime qua setter)
        notification.setMessageService(new SMSService());
        notification.send(msg);
    }
}
