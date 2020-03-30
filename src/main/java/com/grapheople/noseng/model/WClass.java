package com.grapheople.noseng.model;

public enum WClass {
    WARRIOR("전사"), HUNTER("냥꾼"), ROGUE("도적"), DRUID("드루"), PRIEST("사제"), PALADIN("기사"), WARLOCK("흑마"), MAGE("법사"), SHAMAN("주술");

    private String valueKor;
    WClass(String value) {
        this.valueKor = value;
    }

    public String getValueKor() {
        return valueKor;
    }
}
