package com.manish;

import java.util.Arrays;
import java.util.Collections;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecentlyPlayedStoreTest {
    @Test
    public void testRecentlyPlayedStore() {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        Assertions.assertEquals(Arrays.asList("S1", "S2", "S3"), store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "S4");
        Assertions.assertEquals(Arrays.asList("S2", "S3", "S4"), store.getRecentlyPlayedSongs("user1"));
        
        store.addSong("user1", "S2");
        Assertions.assertEquals(Arrays.asList("S3", "S4", "S2"), store.getRecentlyPlayedSongs("user1"));

        store.addSong("user1", "S1");
        Assertions.assertEquals(Arrays.asList("S4", "S2", "S1"), store.getRecentlyPlayedSongs("user1"));

        Assertions.assertEquals(Collections.emptyList(), store.getRecentlyPlayedSongs("user2"));
    }
}


