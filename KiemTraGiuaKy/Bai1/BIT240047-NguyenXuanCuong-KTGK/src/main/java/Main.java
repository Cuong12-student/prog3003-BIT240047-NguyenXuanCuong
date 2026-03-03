/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.List;
import java.util.stream.*;
public class Main {

    public static void main(String[] args) {
        StudentManager<Student> arr=new StudentManager<>();
        arr.add(new Student("BIT240047","Xuan Cuong",7.0));
        arr.add(new Student("BIT242300","Thanh Binh",6.5));
        arr.add(new Student("BIT230042","Dang Khoi",5.0));
        arr.add(new Student("BIT249001","Nam Son",4.6));
        
        for(Student s:arr.getAll()){
            System.out.println(s);
        }       
    }
}
