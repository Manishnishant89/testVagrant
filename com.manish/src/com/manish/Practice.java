package com.manish;

import java.util.List;

public class Practice {
    public static void main (String [] args){
        System.out.println("Hello World");
        RecentlyPlayedStore rp = new RecentlyPlayedStore(5);
        rp.addSong("Akriti", "har karam apna karenge");

        rp.addSong("manish", "dil diya hai jaan bi denge");
        rp.addSong("Avinash", "eh vatan tere liya");
        rp.addSong("manish", "Har har mahadev");
        rp.addSong("Akriti", "Namo namo re Shankara");

        rp.addSong("Akriti", "Bholenath Shankara");
        // rp.addSong("Akriti", "Rudra dev Maheshwara");
        rp.addSong("Akriti", "Shristi ke jaman se hi");
        rp.addSong("Akriti", "pehle thera vaastha, eh jag rahe eh naa rahe, rahegi thera vaastha");
        rp.addSong("Akriti", "hare krishna");

        

        List<String> manish_songs = rp.getRecentlyPlayedSongs("manish");
        List<String> avinash_songs = rp.getRecentlyPlayedSongs("Avinash");
        List<String> suman_songs = rp.getRecentlyPlayedSongs("Akriti");

        System.out.println( "Manish Songs is :"+manish_songs);
        System.out.println("Avinash songs is :"+avinash_songs);
        System.out.println("Suman songs is :"+suman_songs);
        
       
    }
}
