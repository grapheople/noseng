package com.grapheople.noseng.model;

public enum WTalent {
    A("공격"), D("수비"), H("치유");

    private String valueKor;
    WTalent(String value) {
        this.valueKor = value;
    }

    public String getValueKor() {
        return valueKor;
    }
}
