package com.grapheople.noseng.model;


import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Team {
    private Long id;
    private Map<WClass, List<Player>> members;

    public Team() {
        members = Maps.newHashMap();

        for (WClass wClass : WClass.values()) {
            members.put(wClass, Lists.newArrayList());
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.WARRIOR.getValueKor(), members.get(WClass.WARRIOR).size(), 6)).append(members.get(WClass.WARRIOR).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.ROGUE.getValueKor(), members.get(WClass.ROGUE).size(), 6)).append(members.get(WClass.ROGUE).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.MAGE.getValueKor(), members.get(WClass.MAGE).size(), 5)).append(members.get(WClass.MAGE).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.PRIEST.getValueKor(), members.get(WClass.PRIEST).size(), 6)).append(members.get(WClass.PRIEST).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.PALADIN.getValueKor(), members.get(WClass.PALADIN).size(), 5)).append(members.get(WClass.PALADIN).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.WARLOCK.getValueKor(), members.get(WClass.WARLOCK).size(), 4)).append(members.get(WClass.WARLOCK).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.HUNTER.getValueKor(), members.get(WClass.HUNTER).size(), 4)).append(members.get(WClass.HUNTER).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("%s (%d / %d) : ", WClass.DRUID.getValueKor(), members.get(WClass.DRUID).size(), 4)).append(members.get(WClass.DRUID).stream().map(p -> p.getNickName()).collect(Collectors.joining(","))).append("\n");
        stringBuilder.append(String.format("총원 (%d / 40)", members.entrySet().stream().map(entry->entry.getValue().size()).collect(Collectors.summingInt(Integer::intValue))));
        return stringBuilder.toString();
    }
}
