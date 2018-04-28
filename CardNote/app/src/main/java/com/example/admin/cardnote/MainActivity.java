package com.example.admin.cardnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.cardnote.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CardView cardView = (CardView) findViewById(R.id.card_view);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);


        RecycleViewAdapter adapter = new RecycleViewAdapter(getList());
        recyclerView.setAdapter(adapter);

    }

    List <String> getList(){

        List <String> rec = new ArrayList<>(10);

        for (int i=0; i<rec.size();i++){

            rec.add("Value "+ i);
        }
        return rec;
    }
}
