package com.example.admin.recursia;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static  int number = 100;

    public static void main(String[] args) {

    recFunc (number);

    }




    public static int recFunc(int x){

        x = number;



        while (x> 0){

            recFunc(x-10);

            System.out.println (x);

        }

        return x;
    }


}
