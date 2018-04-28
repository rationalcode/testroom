package com.example.admin.testroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    Button addButton;
    Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ArrayList <Chapter> list = new ArrayList<>();
        //String[]list = new String[20];

        for (int i=0; i<10;i++){

            list.add(new Chapter (i,"Chapter "+i));
            //list[i]="Chapter "+i;
        }


        addButton = findViewById(R.id.button);
        deleteButton = findViewById(R.id.button2);
        addButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerViewAdapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button:


                break;
        }
    }
}
