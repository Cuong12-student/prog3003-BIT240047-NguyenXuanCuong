/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exfive;

import java.util.LinkedList;

/**
 *
 * @author VICTUS
 */
public class ExFive {

    public static void main(String[] args) {
         LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Danh sach ban dau:"+list);
        list.addFirst(5);
        list.addLast(40);
        System.out.println("Sau khi them:"+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("Sau khi xoa dau va cuoi:"+list);
    }
}
