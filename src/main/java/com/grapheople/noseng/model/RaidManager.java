package com.grapheople.noseng.model;

import com.google.common.collect.Maps;

import java.util.Map;

public class RaidManager {
    private RaidManager() {}
    private static class LazyHolder {
        private static final RaidManager INSTANCE = new RaidManager();
    }
    public static RaidManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    private Map<Long, Team> teamMap = Maps.newHashMap();

    public Team getTeam(Long id) {
        if (teamMap.get(id) == null) {
            teamMap.put(id, new Team());
        }
        return teamMap.get(id);
    }

    public Team register(Long id, String registerMessage) {
        if (teamMap.get(id) == null) {
            teamMap.put(id, new Team());
        }








        return teamMap.get(id);
    }
}
