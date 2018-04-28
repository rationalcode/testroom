package com.example.admin.firebasetest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Random;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;
import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static java.lang.Thread.sleep;


public class LogoActivity extends AppCompatActivity {

    private static final String LOG ="state_test";
    enum Color { WHITE, BLACK, GREEN, RED, BLUE, GRAY }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_logo);

        final ProgressBar progressBar = findViewById(R.id.progressBar);

        int [] colors = {WHITE, BLACK, GREEN, RED, BLUE, GRAY};
        Random rand = new Random();

        int index = rand.nextInt(6);

        //Log.d(LOG,String.valueOf(colors[rand.nextInt()]));

        getWindow().getDecorView().setBackgroundColor((colors[index]));

        //Toast.makeText(this,currentColor ,Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //ProgressBar progressBar = new ProgressBar(this);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.setVisibility(progressBar.VISIBLE);

                for (int i= 0; i<=100; i+=20){

                    progressBar.incrementProgressBy(i);
                    progressBar.setVisibility(progressBar.VISIBLE);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Intent intent = new Intent(LogoActivity.this,AuthUser.class);
                startActivity(intent);
                finish();
            }
        }, 3*1000);
    }


}
