/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Ex04 {

    public static void main(String[] args) {
        List<String> money=Arrays.asList("$10", "$20", "$50");
        Function<String,Integer> StrtoInt=n->Integer.parseInt(n.substring(1));
        List<Integer> list=money.stream()
                .map(StrtoInt)
                .collect(Collectors.toList());
        System.out.println("Danh sach chuoi sang so nguyen:"+list);
    }
}
