/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class Student {
    private String id;
    private String name;
    private double gpa;
    public Student(String id,String name,double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public void setId(){
        this.id=id;
    }
    public void setName(){
        this.name=name;
    }
    public void setGpa(){
        this.gpa=gpa;
    }   
    @Override
    public String toString(){
        return "Ma:"+getId()+"|Ten:"+getName()+"|Diem trung binh:"+getGpa();      
    }
}
