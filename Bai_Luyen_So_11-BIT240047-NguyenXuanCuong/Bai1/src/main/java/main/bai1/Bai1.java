/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.bai1;

/**
 *
 * @author VICTUS
 */
public class Bai1 {
    public static <E> void printArray(E[] e){
        for(E items:e){
            System.out.println(items);
        }
    }
    public static void main(String[] args) {
        Integer[] ma={1,2,3,4,5,6};
        String[] ten={"James","Jane","Michael","Wu","Akabi","Duong"};
        System.out.println("Danh sach ma nhan vien");
        printArray(ma);
        System.out.println("Danh sach ten nhan vien");
        printArray(ten);
    }
}
