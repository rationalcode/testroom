package com.example.admin.notes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.notes.MainActivity;
import com.example.admin.notes.R;
import com.example.admin.notes.model.Entity;

import java.util.List;

import static com.example.admin.notes.MainActivity.records;

/**
 * Created by Admin on 28.09.2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ViewHolder>{


    //public List<Entity> records;

    public RecyclerAdapter(List<Entity> records) {
        MainActivity.records = records;
    }


    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //добавляет новую запись в RecyclerView

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

        Entity record = records.get(position);
        holder.textView.setText(record.getName());
    }

    @Override
    public int getItemCount() {

        return records.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {       //класс ViewHolder и конструктор поля для вывода RecyclerView

        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.recycler_textview_item);

        }
    }
}
