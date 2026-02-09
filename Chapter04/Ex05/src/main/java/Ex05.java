/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.function.Supplier;
import java.util.Random;
import java.util.function.Consumer;
public class Ex05 {

    public static void main(String[] args) {
        Supplier<Double> r=()->Math.random() * 100;
        Consumer<Double> c=(n)->{System.out.println("So may man:"+n);};
        double lucky=r.get();
        c.accept(lucky);
    }
}
