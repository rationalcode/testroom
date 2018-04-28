package com.example.admin.notes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.notes.adapter.RecyclerAdapter;
import com.example.admin.notes.model.Entity;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    public static List<Entity> records;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Realm.init(this);
//        RealmConfiguration config = new RealmConfiguration.Builder().name("myrealm.realm").build();
//        Realm.setDefaultConfiguration(config);


        Button button_add_item;
        Button button_delete_item;
        button_add_item = (Button) findViewById(R.id.button_add_item);
        button_delete_item = (Button) findViewById(R.id.button_delete_item);

        button_add_item.setOnClickListener((View.OnClickListener) button_add_item);
        button_delete_item.setOnClickListener((View.OnClickListener) button_delete_item);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        RecyclerAdapter adapter = new RecyclerAdapter(records);
        recyclerView.setAdapter(adapter);



        recyclerView.setLayoutManager(layoutManager);



    }


    public void AddItem(View view) {
    }

    public void DeleteItem(View view) {
    }
}

