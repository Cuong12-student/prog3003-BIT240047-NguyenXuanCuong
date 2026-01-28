/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pay;

/**
 *
 * @author VICTUS
 */
public class PayPalPayment implements PaymentStrategy{
    public int pay(int amount){
        return amount*500;
    }
}
