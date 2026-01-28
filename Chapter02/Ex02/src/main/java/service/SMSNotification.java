/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package service;

/**
 *
 * @author VICTUS
 */
public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String s){
        System.out.println("Gui SMS:"+s);
    }
}
