package com.manish;

import java.util.List;

public class Practice {
    public static void main (String [] args){
        System.out.println("Hello World");
        RecentlyPlayedStore rp = new RecentlyPlayedStore(5);
        rp.addSong("Akriti", "Befawfa hai");

        rp.addSong("manish", "jab lagawelu tu lipstick");
        rp.addSong("Avinash", "kitni haseen hogi");
        rp.addSong("manish", "Har har mahadev");
        rp.addSong("Akriti", "zindgi badal di");

        rp.addSong("Akriti", "ham tumhare hai sanam");
        // rp.addSong("Akriti", "Befawfa hai");
        rp.addSong("Akriti", "kudgraj");
        rp.addSong("Akriti", "ram ji ki kripa");
        rp.addSong("Akriti", "hare krishna");

        

        List<String> manish_songs = rp.getRecentlyPlayedSongs("manish");
        List<String> avinash_songs = rp.getRecentlyPlayedSongs("Avinash");
        List<String> suman_songs = rp.getRecentlyPlayedSongs("Akriti");

        System.out.println( "Manish Songs is :"+manish_songs);
        System.out.println("Avinash songs is :"+avinash_songs);
        System.out.println("Suman songs is :"+suman_songs);
        
       
    }
}
