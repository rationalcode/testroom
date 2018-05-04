package com.example.admin.chaptern;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.RoomDatabase;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.chaptern.DB.Database;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static android.arch.persistence.room.Room.databaseBuilder;



public class FirstMenu extends AppCompatActivity {

    private static String DB_NAME = "articles.db";
    private static String DB_PATH = "";
    static Database db;
    EditText title;
    EditText info;
    Button saveButton;
    EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);

        DB_PATH = "/data/data/"+getApplicationContext().getPackageName() + "/databases/";
        title = findViewById(R.id.title);
        info = findViewById(R.id.info);
        saveButton = findViewById(R.id.saveButton);
        result = findViewById(R.id.result);

        if (db==null){

            db = databaseBuilder(getApplicationContext(),
                    Database.class, DB_NAME)
                    .addCallback(new RoomDatabase.Callback() {
                        @Override
                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                            super.onCreate(db);

                            try {

                                InputStream mInput = getApplicationContext().getAssets().open(DB_NAME);
                                //InputStream mInput = mContext.getResources().openRawResource(R.raw.info);
                                OutputStream mOutput = new FileOutputStream(DB_PATH + DB_NAME);
                                byte[] mBuffer = new byte[1024];
                                int mLength;
                                while ((mLength = mInput.read(mBuffer)) > 0)
                                    mOutput.write(mBuffer, 0, mLength);
                                mOutput.flush();
                                mOutput.close();
                                mInput.close();
                                Log.d("db","db copy!");
                            }

                            catch (IOException ioe){
                                Log.d("db","db not copy!");
                                throw new Error("ErrorCopyDataBase");

                            }


                        }

                        @Override
                        public void onOpen(@NonNull SupportSQLiteDatabase db) {
                            super.onOpen(db);
                        }
                    })
                    .build();

            //new Toast(getApplicationContext()).makeText(getApplicationContext(), "db created!", LENGTH_SHORT).show();
            Log.d("db","db created");

        }
//


        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Article.setTitle(title.getText().toString(), info.getText().toString());

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        int i=0;
                        StringBuilder stringBuilder = new StringBuilder();
                        for (Article article : Article.list) {

                            i++;
                            //stringBuilder.append(String.valueOf(Article.list.size())+": ");
                            stringBuilder.append(i+". "+ article.toString()+" ");
                            result.setText(stringBuilder);
                            //result.setText(String.valueOf(Article.list.size()));
                        }
                    }
                });
            }

        });



    }


}
