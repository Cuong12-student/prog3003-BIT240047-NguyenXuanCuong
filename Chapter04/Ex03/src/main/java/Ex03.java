/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.function.Predicate;
public class Ex03 {

    public static void main(String[] args) {
        Predicate<Integer> even=n->n%2==0;
        System.out.println("So chan:"+even.test(4));
        System.out.println("So chan:"+even.test(5));
    }
}
