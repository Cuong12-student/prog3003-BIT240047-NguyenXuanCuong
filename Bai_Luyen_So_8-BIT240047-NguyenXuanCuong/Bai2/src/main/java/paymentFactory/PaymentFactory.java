/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentFactory;
import payment.*;
/**
 *
 * @author VICTUS
 */
public class PaymentFactory {
    public static Payment getPayment(String type){
        System.out.print("Chon:");
        if(type.equalsIgnoreCase("credit")){
            return new CreditCard();
        }else if(type.equalsIgnoreCase("paypal")){
            return new PayPal();
        }else if(type.equalsIgnoreCase("cash")){
            return new Cash();
        }else{
            throw new IllegalArgumentException("Chon lai");
        }
    }
}
