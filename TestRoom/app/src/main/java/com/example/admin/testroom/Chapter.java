package com.example.admin.testroom;

/**
 * Created by Admin on 12.02.2018.
 */

public class Chapter {

    protected int num;
    protected String name;

    public Chapter(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
