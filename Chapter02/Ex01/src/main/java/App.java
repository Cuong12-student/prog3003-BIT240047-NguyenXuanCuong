/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
import User.UserService;
import config.DatabaseConnection;
public class App {
    public static void main(String[] args){
        DatabaseConnection db1=DatabaseConnection.getInstance();
        System.out.println("Chuong trinh bat dau");
        UserService u = new UserService();
        u.printInfo();
        DatabaseConnection db2=DatabaseConnection.getInstance();
        if(db1==db2){
            System.out.println("Ket noi thanh cong");
        }
    }
}
