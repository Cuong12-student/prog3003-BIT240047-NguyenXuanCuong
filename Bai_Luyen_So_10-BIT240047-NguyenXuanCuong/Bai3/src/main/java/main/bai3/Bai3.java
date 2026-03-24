/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.bai3;

/**
 *
 * @author VICTUS
 */
class WorkerThread extends Thread{
    @Override
    public void run(){
            System.out.println("Thread dang chay...");
            try{
                sleep(3000);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
    }
}
class WorkerRunnable implements Runnable{
    @Override
    public void run(){
            System.out.println("Runnable dang chay...");
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
    }
}

public class Bai3 {

    public static void main(String[] args) {
        WorkerThread t1 = new WorkerThread();
        t1.start();
        Thread t2 = new Thread(new WorkerRunnable());
        t2.start();
    }
    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
