/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payment;

/**
 *
 * @author VICTUS
 */
public class CreditCard implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Thanh toan bang Credit Card:"+amount);
    }
}
