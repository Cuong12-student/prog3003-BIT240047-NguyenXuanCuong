/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bai1;

/**
 *
 * @author VICTUS
 */
class NhanVien{
    private int ma;
    private String hoTen;
    public NhanVien(){}
    public NhanVien(int ma,String hoTen){
        this.ma=ma;
        this.hoTen=hoTen;
    }
    @Override
    public String toString() {
        return "ID: " + ma + ", Ten: " + hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }
}