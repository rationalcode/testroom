package com.example.admin.cardnote2.adapter;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.cardnote2.MainActivity;
import com.example.admin.cardnote2.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.admin.cardnote2.R.id.button;
import static com.example.admin.cardnote2.R.id.card_view;
import static com.example.admin.cardnote2.R.id.fab;


/**
 * Created by Admin on 04.10.2017.
 */


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    public static int countNewIndex;
    public List<String> records;



    public RecyclerViewAdapter(List<String> rec){

        this.records = rec;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        String currentPosition = records.get(position);
        holder.textView.setText(records.get(position));
        holder.addItemButtonListener.setItem(currentPosition);

//        holder.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(v.getContext(), "Press fab", Toast.LENGTH_SHORT).show();
//            }
//        });



    }

    @Override
    public int getItemCount() {
        return records.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;

        TextView textView;
        Button button;
        ImageView imageView;
        FloatingActionButton fab;

         private AddItemButtonListener addItemButtonListener;

        public ViewHolder(View itemView) {
            super(itemView);


            fab = (FloatingActionButton) itemView.findViewById(R.id.fab);
            cardView = (CardView) itemView.findViewById(card_view);
            textView = (TextView) itemView.findViewById(R.id.textView);
            button = (Button) itemView.findViewById(R.id.button);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);

            addItemButtonListener = new AddItemButtonListener();

            //fab.setOnClickListener(addItemButtonListener);
            button.setOnClickListener(addItemButtonListener);




            //cardView.setOnClickListener((View.OnClickListener) this);

        }

    }



    public class AddItemButtonListener implements View.OnClickListener{

        String currentPosition;

        @Override
        public void onClick(View v) {


            switch (v.getId()){

                case button:

                    int position = records.indexOf(currentPosition);

                    int count = getItemCount()+1;

                    Toast.makeText(v.getContext(), position+"; insert: "+count, Toast.LENGTH_SHORT).show();

                    records.add(position,"New "+countNewIndex);

                    notifyItemInserted(position);

                    //notifyItemRangeChanged(0, 20);

                    countNewIndex++;

                    break;
                case fab:

                    Toast.makeText(v.getContext(), "Press fab", Toast.LENGTH_SHORT).show();

            }


        }

        public void setItem (String currentPosition){

            this.currentPosition = currentPosition;
        }

    }


}
