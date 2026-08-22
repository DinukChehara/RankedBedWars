package me.tomqnto.rankedbw.object;

import lombok.Getter;

import java.util.HashMap;
import java.util.UUID;

@Getter
public class User {

    private final int discordId;
    private final UUID uuid;

    public static final HashMap<UUID, UUID> activeCodes = new HashMap<>();
    public static final HashMap<Integer, UUID> linked = new HashMap<>();

    public User(int discordId, UUID uuid) {
        this.discordId = discordId;
        this.uuid = uuid;
    }

    public static UUID getCode(UUID player) {
        return activeCodes.putIfAbsent(UUID.randomUUID(), player);
    }

    public static int claimCode(int discordId, UUID code) {
        if (linked.containsKey(discordId)) return 1;
        if (!activeCodes.containsValue(code)) return 2;
        linked.put(discordId, activeCodes.remove(code));
        return 0;
    }

}
