package com.example.admin.eg;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Collection;

/**
 * Created by Admin on 09.11.2017.
 */

public class Chapter extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_info);


        TextView textView = (TextView) findViewById(R.id.textView);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.chapter_0,
                android.R.layout.simple_list_item_1);



        Intent intent = getIntent();
        String currentTextChapter = intent.getStringExtra("currentChapter");

        switch (Integer.valueOf(currentTextChapter)){

            case 0:
        }


        textView.setText(currentTextChapter);

    }

}
