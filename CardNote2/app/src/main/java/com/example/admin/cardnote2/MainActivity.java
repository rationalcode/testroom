package com.example.admin.cardnote2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.admin.cardnote2.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //FloatingActionButton fab;

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(initData());
        LinearLayoutManager llm = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        //fab = (FloatingActionButton) findViewById(R.id.fab);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(llm);
        recyclerView.setItemAnimator(itemAnimator);
        recyclerView.setHasFixedSize(true);

       //fab.setVisibility(View.VISIBLE);





    }

     List<String> initData (){

         List<String> rec = new LinkedList<>();
         for(int i=0; i<5; i++){
            rec.add("Value "+i);
         }

         return rec;
     }

//    public static List<String> initData(List<String> records){
//
//        List<String> rec = records;
//
//        rec.add("New value");
//
//        return rec;
//    }
}
