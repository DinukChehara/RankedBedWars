package me.tomqnto.rankedbw.object;

import it.unimi.dsi.fastutil.Pair;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    private final Pair<Integer, Integer> slot;
    private final List<User> players;

    public Arena(Pair<Integer, Integer> slot) {
        this.slot = slot;
        this.players = new ArrayList<>();
    }
}
