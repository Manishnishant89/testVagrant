package com.manish;

import java.util.*;

public class RecentlyPlayedStore {
    private int capacity;
    private Map<String, LinkedList<String>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void addSong(String user, String song) {
        if (store.containsKey(user)) {
            LinkedList<String> userSongs = store.get(user);
            userSongs.remove(song);
        } else {
            LinkedList<String> userSongs = new LinkedList<>();
            store.put(user, userSongs);
        }
        LinkedList<String> userSongs = store.get(user);
        userSongs.addLast(song);
        if (userSongs.size() > capacity) {
            userSongs.removeFirst();
        }
    }

    public List<String> getRecentlyPlayedSongs(String user) {
        if (store.containsKey(user)) {
            return store.get(user);
        } else {
            return Collections.emptyList();
        }
    }
}
