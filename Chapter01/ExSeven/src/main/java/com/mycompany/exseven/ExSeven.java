/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exseven;

import java.util.TreeSet;

/**
 *
 * @author VICTUS
 */
public class ExSeven {

    public static void main(String[] args) {
        //Tree set sẽ sắp xếp theo thứ tự đầu từ A->Z
        TreeSet<String> set=new TreeSet<>();
        set.add("John");
        set.add("Alice");
        set.add("Zach");
        set.add("Bob");
        System.out.println("Danh sach:"+set); 
        String firstString=set.first();
        String lastString=set.last();
        System.out.println("Phan tu lon nhat:"+firstString);
        System.out.println("Phan tu be nhat:"+lastString);
    }
}
