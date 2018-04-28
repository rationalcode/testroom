package com.example.admin.notes.model;

import io.realm.RealmObject;

/**
 * Created by Admin on 28.09.2017.
 */

public class Entity extends RealmObject {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
