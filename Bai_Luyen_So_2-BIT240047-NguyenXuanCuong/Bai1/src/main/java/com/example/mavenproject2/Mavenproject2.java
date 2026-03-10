/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.mavenproject2;

/**
 *
 * @author VICTUS
 */
import java.util.Map;
import java.util.TreeSet;
public class Mavenproject2 {

    public static void main(String[] args) {
        TreeSet<String> name=new TreeSet<>();
        name.add("John");
        name.add("Alice");
        name.add("Zack");
        name.add("Bob");
        System.out.println("In danh sach ten");
        for(String names:name){
            System.out.println(names);
        }
        String first=name.first();
        System.out.println("Phan tu lon nhat:"+first);
        String last=name.last();
        System.out.println("Phan tu nho nhat:"+last);
    }
}
