/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exthree;

/**
 *
 * @author VICTUS
 */
public class ExThree {

    public static void main(String[] args) {
        Pair<String,Integer> new1=new OrderedPair<>("MSSV",10170);
        Pair<String,String> new2=new OrderedPair<>("HoTen","Nguyen Thi Hoa");
        System.out.println(new1.getKey()+":"+new1.getValue());
        System.out.println(new2.getKey()+":"+new2.getValue());
    }
}
