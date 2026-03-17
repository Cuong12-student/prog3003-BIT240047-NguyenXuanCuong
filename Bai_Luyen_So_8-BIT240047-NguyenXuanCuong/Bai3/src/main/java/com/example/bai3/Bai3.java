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
import java.util.concurrent.TimeUnit;
public class Bai3 {
    public static CompletableFuture<String> checkUser(String user){
        return CompletableFuture.supplyAsync(()->{
            sleep(1500);
            if("Cuong123".equals(user)){
                System.out.println("Xac nhan thanh cong");
                return user;
            }else{
                throw new RuntimeException("Xac nhan that bai");
            }
        });
    }
    public static CompletableFuture<Double> checkAmount(String user,double amount){
        return CompletableFuture.supplyAsync(()->{
            sleep(2000);
            double soDu=750.0;
            System.out.println("Kiem tra so du:"+soDu);
            if(soDu>=amount){
                return soDu-amount;
            }else{
                throw new RuntimeException("So du khong du");
            }
        });
    }
    public static CompletableFuture<String> tranferForMoney(double amount){
        return CompletableFuture.supplyAsync(()->{
            sleep(1500);
            System.out.println("Chuyen tien:"+amount+"...");
            return "Chuyen thanh cong:"+amount;
        });
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        String user="Cuong123";
        double amount=200.0;
        CompletableFuture<String> wait=checkUser(user)
               .thenCompose(User->checkAmount(user,amount))
               .thenCompose(money->tranferForMoney(amount))
               .exceptionally(ex -> {
                return "Giao dich bi huy: " + ex.getMessage();
            });
        System.out.println("Ket qua giao dich:"+wait.get());
    }
    private static void sleep(int ms) {
        try { 
            TimeUnit.MILLISECONDS.sleep(ms); 
        } catch (InterruptedException e) { 
        }
    }
}
