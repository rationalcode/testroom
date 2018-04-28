package com.example.admin.chaptern;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Random;

@Entity(tableName = "Notion")
public class Notion implements Document{

    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo (name = "notion")
    static String notion;

    public Notion() {

                    //this.notion = String.valueOf((new Random().nextInt(100)));
            }

    @Override
    public <T> T getTitle(T item) {
        return null;
    }

    @Override
    public <T> T getInfo() {
        return null;
    }
}
