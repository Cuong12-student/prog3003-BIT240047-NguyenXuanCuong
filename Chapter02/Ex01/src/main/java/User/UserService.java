/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author VICTUS
 */
import config.DatabaseConnection;
public class UserService {
    public void printInfo(){
        DatabaseConnection config=DatabaseConnection.getInstance();
        System.out.println("Danh thuc thi cau lenh:"+config.getURL());    
    }
}
