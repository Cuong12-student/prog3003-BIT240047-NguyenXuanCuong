/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exsix;

import java.util.HashSet;

/**
 *
 * @author VICTUS
 */
public class ExSix {

    public static void main(String[] args) {
        // Hashset có chức năng tập hợp các phần tử với phần tử duy nhất và tự động sắp xếp theo tăng dần
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(9);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(1);
        System.out.println("Danh sach ban dau:"+set);
    }
}
