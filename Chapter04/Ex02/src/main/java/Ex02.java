/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class Ex02 {

    public static void main(String[] args) {
        List<String> city = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
        Collections.sort(city, (s1, s2) -> s1.length() - s2.length());
        System.out.println(city);
    }
}
