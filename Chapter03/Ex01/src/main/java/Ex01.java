/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
class  WorkerThread extends Thread{
    @Override
    public void run(){
    System.out.println("Thread dang chay...");
    try{
       Thread.sleep(5000);
       }catch (InterruptedException e){
          e.printStackTrace();
       }
    }
}
class WorkerRunnable implements Runnable{
    @Override
    public void run(){
    System.out.println("Runnable dang chay...");
    try{
      Thread.sleep(7000);
      }catch (InterruptedException e){
        e.printStackTrace();
      }
    }
}

public class Ex01 {

    public static void main(String[] args) {
        WorkerThread t1=new WorkerThread();
        Runnable r1=new WorkerRunnable();
        Thread t2=new Thread(r1);
        t1.start();
        t2.start();
        System.out.println("He thong da chay");

    }
}
