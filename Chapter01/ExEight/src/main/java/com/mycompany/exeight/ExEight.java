/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exeight;

/**
 *
 * @author VICTUS
 */
import java.util.HashMap;
public class ExEight {

    public static void main(String[] args) {
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(101,"Anna");
        mp.put(102,"Peter");
        mp.put(103,"Mary");
        System.out.println("Danh sach ban dau:"+mp);
        System.out.println("Ten co ma 102:"+mp.get(102));
        if(!mp.containsKey(105)){
            mp.put(105,"Unknown");
        }
        System.out.println("Danh sach duoc them:");
        for(Integer ma:mp.keySet()){
            System.out.println(ma+":"+mp.get(ma));
    }
}
}
