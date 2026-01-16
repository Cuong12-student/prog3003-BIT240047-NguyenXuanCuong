/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exnine;

import java.util.TreeMap;
import java.util.Map;
/**
 *
 * @author VICTUS
 */
public class ExNine {

    public static void main(String[] args) {
        TreeMap<String,Double> mp=new TreeMap<>();
        mp.put("Laptop",1500.0);
        mp.put("Mouse",25.0);
        mp.put("KeyBoard",50.0);
        System.out.println("Danh sach ban dau:"+mp);
        System.out.println("Danh sach duoc sap xep:");
        for(Map.Entry<String, Double> entry: mp.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("Danh sach sap xep tu K den M");
        Map<String,Double> sMP=mp.subMap("K", "M");
        for(Map.Entry<String,Double> entry:sMP.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
