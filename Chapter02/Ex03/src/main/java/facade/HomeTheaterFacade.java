/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author VICTUS
 */
import subsystem.*;
public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private SoundSystem ss;
    private TV tv;
    public HomeTheaterFacade(DVDPlayer dvd, SoundSystem ss, TV tv){
        this.dvd=dvd;
        this.ss=ss;
        this.tv=tv;
    }
    public void watchMovie(){
        System.out.println("Phim dang chieu");
        tv.on();
        ss.on();
        ss.setAmLuong(15);
        dvd.on();
        dvd.play();
    }
    public void endMovie(){
        System.out.println("Phim da tat");
        tv.off();
        ss.off();
        dvd.off();
    }
}
