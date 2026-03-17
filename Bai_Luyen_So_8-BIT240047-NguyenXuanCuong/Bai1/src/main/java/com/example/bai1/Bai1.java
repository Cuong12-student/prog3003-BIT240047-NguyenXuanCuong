/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bai1;

/**
 *
 * @author VICTUS
 */
import java.util.ArrayList;
import java.util.Scanner;
class SinhVien{
    private String MSSV;
    private String Ten;
    private double GPA;
    public SinhVien(){
    }
    public SinhVien(String MSSV,String Ten,double GPA){
        this.MSSV=MSSV;
        this.Ten=Ten;
        this.GPA=GPA;
    }
    public String getMSSV(){
        return MSSV;
    }
    public String getTen(){
        return Ten;
    }
    public double getGPA(){
        return GPA;
    }
    @Override
    public String toString(){
        return "Ma:"+MSSV+"| Ten:"+Ten+"| Diem:"+GPA;
    }
}
public class Bai1 {
    private static ArrayList<SinhVien> list=new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do{
           System.out.println("==== MENU ====");
           System.out.println("1. Them sinh vien");
           System.out.println("2. Xoa sinh vien");
           System.out.println("3. Tim kiem sinh vien");
           System.out.println("4. Hien thi sinh vien");
           System.out.println("0. Thoat");
           System.out.print("Chon:");
           choice=sc.nextInt();
           sc.nextLine();
           switch(choice){
                case 1:
                   them();
                   break;
                case 2:
                    xoa();
                    break;
                case 3:
                    timKiem();
                    break;
                case 4:
                    hienThi();
                    break;
                case 0:
                    System.out.println("Chuong trinh thoat");
                    break;
            }
        }while(choice!=0);
    }
    private static void them(){
        System.out.print("Nhap so luong sinh vien can nhap:");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("@Nhap thu {i+1}");
            System.out.print("Nhap ma sinh vien:");
            String id=sc.nextLine();
            System.out.print("Nhap ten sinh vien:");
            String name=sc.nextLine();
            System.out.print("Nhap diem sinh vien:");
            double gpa=sc.nextDouble();
            sc.nextLine();
            list.add(new SinhVien(id,name,gpa));          
        }
        System.out.println("Them sinh vien thanh cong");
    }
    private static void xoa(){
        System.out.print("Nhap ma:");
        String id=sc.nextLine();
        boolean found=list.removeIf(s -> s.getMSSV().equals(id));
        if(found){
            System.out.println("Xoa thanh cong");
        }else{       
            System.out.println("Xoa that bai");
        }
    }
    private static void timKiem(){
        System.out.print("Nhap ten:");
        String name=sc.nextLine();
        boolean found=false;
        for(SinhVien s:list){
            if(s.getTen().contains(name)){
                System.out.println(s);
                found=true;
            }
        }
        if(!found){
            System.out.println("Khong tim thay sinh vien");
        }
    }
    private static void hienThi(){
        if(list.isEmpty()){
            System.out.println("Danh sach trong");
        }else{
            System.out.println("==== DANH SACH SINH VIEN ====");
            for(SinhVien s:list){
                System.out.println(s);
            }
        }
    }
}
