package com.grapheople.noseng.model;

import lombok.Data;

@Data
public class Player {
    private WClass wClass;
    private WTalent wTalent;
    private String nickName;

    public Player(String registerMessage) {

    }
}
