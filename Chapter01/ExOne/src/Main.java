package Bai1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */

class Test<T>{
    private T t;
    public void set (T t){
        this.t=t;
    }
    public T get (){
        return t;
    }
}
public class Main {
    public static void main(String[] args){
        Test<Integer> intTest=new Test<>();
        intTest.set(1);
        intTest.set(2);
        System.out.println(intTest.get());
        Test<String> stringTest=new Test<>();
        stringTest.set("I'm a student of CMC University");
        stringTest.set("Toi la sinh vien cua Truong Dai Hoc CMC");
        System.out.println(stringTest.get());
}
}

