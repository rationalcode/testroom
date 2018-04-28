package com.example.admin.history;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.admin.history.Paragraf.paragrafs;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter <Paragraf> adapter = new ArrayAdapter<Paragraf>(this, R.layout.simple_list_item_1, paragrafs);
        listView.setAdapter(adapter);
    }
}
