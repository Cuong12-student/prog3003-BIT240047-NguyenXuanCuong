package main.bai2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VICTUS
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Hỗ trợ mặc định file MP3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Dang phat file MP3: " + fileName);
        } 
        // Dùng Adapter cho file VLC
        else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } 
        else {
            System.out.println("dinh dang " + audioType + " khong duoc ho tro.");
        }
    }
}