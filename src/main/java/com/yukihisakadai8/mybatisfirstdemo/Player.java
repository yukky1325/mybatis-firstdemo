package com.yukihisakadai8.mybatisfirstdemo;

import java.util.Date;

public class Player {
    private int id;
    private String name;

    private Date birthday;

    private String ps;

    public Player(int id, String name, Date birthday, String ps) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.ps = ps;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPs() {
        return ps;
    }
}
