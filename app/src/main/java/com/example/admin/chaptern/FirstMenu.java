package com.example.admin.chaptern;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.chaptern.DB.Database;

import static android.arch.persistence.room.Room.databaseBuilder;
import static android.widget.Toast.LENGTH_SHORT;


public class FirstMenu extends AppCompatActivity {

    static Database db;
    EditText title;
    EditText info;
    Button saveButton;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);

        title = findViewById(R.id.title);
        info = findViewById(R.id.info);
        saveButton = findViewById(R.id.saveButton);
        result = findViewById(R.id.result);

        if (db==null){
            db = databaseBuilder(getApplicationContext(),
                    Database.class, "articles-db").build();
            //new Toast(getApplicationContext()).makeText(getApplicationContext(), "db created!", LENGTH_SHORT).show();

        }
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Article.setTitle(title.getText().toString(), info.getText().toString());

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        for (Article article : Article.list) {
                            result.setText(article.toString());
                            result.setText(String.valueOf(Article.list.size()));
                        }
                    }
                });
            }

        });



    }


}
