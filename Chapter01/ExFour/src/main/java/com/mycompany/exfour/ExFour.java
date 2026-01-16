/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exfour;

import java.util.ArrayList;

/**
 *
 * @author VICTUS
 */
public class ExFour {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("Danh sach ban dau:"+list);
        list.add(1,"Mango");
        System.out.println("Sau khi them:"+list);
        list.set(2, "Grapes");
        System.out.println("Sau khi thay the:"+list);       
        System.out.println("Apple xuat hien:"+list.get(0));
    }
}
