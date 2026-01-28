/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import Service.ShoppingCart;
import pay.CreditCardPayment;
import pay.PayPalPayment;
public class App {

    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        int amount=12;
        cart.setPaymentStrategy(new CreditCardPayment());
        System.out.println("CreditCard:"+cart.checkout(amount));
        cart.setPaymentStrategy(new PayPalPayment());
        System.out.println("PayPal:"+cart.checkout(amount));
    }
}
