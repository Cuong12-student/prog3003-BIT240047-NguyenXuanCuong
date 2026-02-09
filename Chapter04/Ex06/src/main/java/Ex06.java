/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.*;
import java.util.stream.Collectors;
public class Ex06 {

    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list=num.stream()
            .filter(n->n%2==0)
            .map(n->n*n)
            .collect(Collectors.toList());   
        System.out.println("Ket qua:"+list);
    }
}
