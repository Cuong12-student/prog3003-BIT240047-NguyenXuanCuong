/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bai2;

/**
 *
 * @author VICTUS
 */

public class Bai2 {

    public static void main(String[] args) {
        Computer officePC=new Computer.ComputerBuilder("256GB","12GB")
                .setBluetoothEnabled(false)
                .build();
        Computer gamingPC=new Computer.ComputerBuilder("512GB","24GB")
                .setBluetoothEnabled(true)
                .build();
        System.out.println("May tinh gaming:"+gamingPC.isBluetoothEnabled());
        System.out.println("May tinh van phong:"+officePC.isBluetoothEnabled());
    }
}
