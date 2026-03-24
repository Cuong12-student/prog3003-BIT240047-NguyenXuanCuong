/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.bai1;

/**
 *
 * @author VICTUS
 */
import java.util.HashMap;
import java.util.Scanner;
import main.bai1.NhanVien;
public class Bai1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,NhanVien> hm=new HashMap<>();
        for(int i=1;i<=3;i++){
            System.out.println("Nhap thu tu:");
            System.out.print("Nhap ma nhan vien:");
            int ma=sc.nextInt();
            sc.nextLine();
            System.out.print("Nhap ho ten nhan vien:");
            String hoTen=sc.nextLine();
            hm.put(ma,new NhanVien(ma,hoTen));
        }
        if(hm.containsValue(102)){
            System.out.println("Da tim thay:"+hm.get(102));
        }
        if (!hm.containsKey(105)) {
            hm.put(105, new NhanVien(105, "Unknown"));
            System.out.println("Da them nhan vien 105 (Unknown).");
        }
        System.out.println("\nDanh sach nhan vien:");
        for (NhanVien nv : hm.values()) {
            System.out.println(nv);
        }
        
        sc.close();
    }
}
