package com.example.admin.thread_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {

        for (int i=0; i<3; i++) {
            Thread r = new Thread(new simpleTasks());
            r.start();
        }
    }


}
