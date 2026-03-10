/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example.bai3;

/**
 *
 * @author VICTUS
 */
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class Bai3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException{
        System.out.println("Hệ thống bắt đầu xử lý");
        CompletableFuture<String> check=CompletableFuture.supplyAsync(()->{
            System.out.println("Dang xac thuc thong tin khach hang");
            sleep(2000);
            return "Xac thuc thanh cong";
        });
        CompletableFuture<String> give=CompletableFuture.supplyAsync(()->{
            System.out.println("Xuat ve xem phim");
            sleep(2000);
            return "Da xuat ve";
        });
        CompletableFuture<Void> all=CompletableFuture.allOf(check,give);
        all.thenRun(()->{
            System.out.println(check.join());
            System.out.println(give.join());
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
