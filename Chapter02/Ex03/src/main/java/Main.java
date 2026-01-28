/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import subsystem.*;
import facade.HomeTheaterFacade;
public class Main {

    public static void main(String[] args) {
       HomeTheaterFacade hf=new HomeTheaterFacade(
       new DVDPlayer(),new SoundSystem(),new TV());
       hf.watchMovie();
       hf.endMovie();
    }
}
