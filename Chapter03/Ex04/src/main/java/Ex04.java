/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class Ex04 {

    public static void main(String[] args) {
        System.out.println("Bat dau xu ly don hang...");
        CompletableFuture<String> check=CompletableFuture.supplyAsync(()->{
            sleep(1000);
            return "1. Kiem tra hang:Xong";
        });
        CompletableFuture<String> payment=CompletableFuture.supplyAsync(()->{
            sleep(1000);
            return "2. Thanh toan:Xong" ;
        });
        CompletableFuture<String> tranfer=CompletableFuture.supplyAsync(()->{
            sleep(1000);
            return "3.Van chuyen:Xong" ;
        });
        CompletableFuture<Void> models=CompletableFuture.allOf(check,payment,tranfer);
        models.thenRun(()->{
            System.out.println("He thong xu ly don hang");
            System.out.println(check.join());
            System.out.println(payment.join());
            System.out.println(tranfer.join());
        }).join();
    }
    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
