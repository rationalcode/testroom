package com.example.admin.eg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class SelectActivity extends Activity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        ListView listView = findViewById(R.id.ListView);
        listView.setOnItemClickListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.glavs,
                android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        String currentChapter = Integer.toString(i);
        Intent intent = new Intent(this, Chapter.class);
        intent.putExtra("currentChapter",currentChapter);
            startActivity(intent);


//        String position = String.valueOf(adapterView.getItemAtPosition(i));
//        Toast toast = Toast.makeText(this, "Click item "+ adapterView +" "+ i, Toast.LENGTH_SHORT);
//        toast.show();

    }
}
