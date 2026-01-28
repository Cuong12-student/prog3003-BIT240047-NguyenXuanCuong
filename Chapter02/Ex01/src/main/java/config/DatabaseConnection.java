/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author VICTUS
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String URL="SQL://localhost:Cuong123..";
    private DatabaseConnection(){
        System.out.println("Dang khoi tao du lieu...");
    }
    public static DatabaseConnection getInstance(){
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public String getURL(){
        return URL;
    }
}
