package com.example.admin.history;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 15.01.2018.
 */

public class Paragraf {


    private static int number;
    private static String title;

    public static List <Paragraf> paragrafs = new ArrayList<>(10);

    public Paragraf(int number, String title) {

        this.number = number;
        this.title = title;

    }

    public static List<Paragraf> fillArray (){

        for (int i=1; i<paragrafs.size(); i++) {

            Paragraf e = new Paragraf(i, " Глава");
            paragrafs.add(e);


            }

            return paragrafs;

    }

    public static void main(String[] args) {

    }


}
