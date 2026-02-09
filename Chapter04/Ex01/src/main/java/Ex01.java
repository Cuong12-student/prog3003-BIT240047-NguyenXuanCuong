/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
public class Ex01 {

    public static void main(String[] args) {
        MathOperation add=(a,b)->a+b;
        System.out.println("Tong="+add.compute(4,6));
        MathOperation sub=(a,b)->a-b;
        System.out.println("Hieu="+sub.compute(8,3));
        MathOperation multi=(a,b)->a*b;
        System.out.println("Tich="+multi.compute(12, 5));
        MathOperation divi=(a,b)->b!=0?a/b:0;          
        System.out.println("Thuong="+divi.compute(10,2));
    }  
}
