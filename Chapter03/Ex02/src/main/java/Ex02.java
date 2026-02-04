/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
class PrintThread implements Runnable{
    @Override
    public void run(){
     for(int i=1;i<=10;i++){
        System.out.println(Thread.currentThread().getName()+" So:"+i);
        try{
          Thread.sleep(1000);
        }catch (InterruptedException e){
           e.printStackTrace();
        }
     }
    }   
}
public class Ex02 {
    public static void main(String[] args){
       for(int i=1;i<=5;i++){
           Thread thread=new Thread(new PrintThread(),"Thread:"+i);
           thread.start();
       }   
    }
}
