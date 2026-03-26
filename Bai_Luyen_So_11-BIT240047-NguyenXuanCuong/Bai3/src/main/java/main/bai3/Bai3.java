/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.bai3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author VICTUS
 */
class Employee{
    public int id;
    public String name;
    public double salary;
    public Employee(){}
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Bai3 {

    public static void main(String[] args) {
        List<Employee> employees=Arrays.asList(
        new Employee(1,"James",1300),
        new Employee(2,"Jane",1200),
        new Employee(3,"Tung",300),
        new Employee(4,"Linh",650));
        List<String> list=employees.stream()
                .filter(e->e.salary>1000)
                .map(e->e.name)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
