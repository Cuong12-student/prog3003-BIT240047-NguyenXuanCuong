/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bai2;

/**
 *
 * @author VICTUS
 */
import java.util.Scanner;
import payment.*;
import paymentFactory.*;
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice;       
        System.out.println("==== PAYMENT MENU ====");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        System.out.print("Chon phuong thuc: ");
        choice = sc.nextLine();
        System.out.print("Nhap so tien: ");
        double amount = sc.nextDouble();
        try {
            Payment payment = PaymentFactory.getPayment(choice);
            payment.pay(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
