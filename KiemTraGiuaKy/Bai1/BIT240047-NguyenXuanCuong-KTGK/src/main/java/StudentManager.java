/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
import java.util.List;
import java.util.ArrayList;
public class StudentManager <T> {
    private List<T> data;
    
    public StudentManager(){
      data=new ArrayList<>();
}
    public void add(T item){
        data.add(item);
    }
    public List<T> getAll(){
        return data;
    }       
}
