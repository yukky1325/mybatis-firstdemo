package com.yukihisakadai8.mybatisfirstdemo;

import java.util.Date;

public class Player {
    private int id;
    private String name;

    private Date birthdy;

    private String ps;

    public Player(int id, String name, Date birthdy, String ps) {
        this.id = id;
        this.name = name;
        this.birthdy = birthdy;
        this.ps = ps;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdy() {
        return birthdy;
    }

    public String getPs() {
        return ps;
    }
}
