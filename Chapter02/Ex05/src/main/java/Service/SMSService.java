/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author VICTUS
 */
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("Gui SMS:"+message);
    }
}
