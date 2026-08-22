package me.tomqnto.rankedbw.managers;

import it.unimi.dsi.fastutil.Pair;

public class ArenaManager {

    public static final Pair<Integer, Integer>[] slots = new Pair[10];
    // initialize hashmap with slot and its arena

    static {
        for (int x=0; x<=10000; x+=1000) {
            for (int y=0; y<=10000; y+=1000)
                slots[x/1000] = Pair.of(x,y);
        }
    }

}
