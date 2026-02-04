/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
public class Ex03 {

    public static void main(String[] args) {
        CompletableFuture           
            .supplyAsync(() -> {               
                System.out.println("B1: Tao mang...");
                sleep(5000);
                return Arrays.asList(1, 2, 5, 3, 100);
            })
        .thenApply(List->{
            System.out.println("B2 Chon so le");
            sleep(7000);
            return List.stream()
                    .filter(n->n%2!=0)
                    .sorted()
                    .collect(Collectors.toList());
        })
        .thenApply(result->{
            System.out.println("B3 Chuyen thanh chuoi");
            return "Ket qua chuoi:"+result;
        })
                .thenAccept(finalResult->{
                    sleep(5000);
                    System.out.println("B4 In ket qua");
                    System.out.println(finalResult);
                }).join();
    }
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
