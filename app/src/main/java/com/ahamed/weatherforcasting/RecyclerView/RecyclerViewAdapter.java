package com.ahamed.weatherforcasting.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.ahamed.weatherforcasting.R;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    ArrayList<Data> list;
    Context context;
    ItemClickListener itemClickListener;
   public RecyclerViewAdapter(ArrayList<Data> list, Context context){
       this.list=list;
       this.context=context;
   }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.template,parent,false);
        return new MyViewHolder(view);
    }
   public void setItemClickListener(ItemClickListener itemClickListener){
       this.itemClickListener=itemClickListener;
   }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
         String degree=list.get(position).degree + (char) 0x00b0 + "C";

         holder.day.setText(list.get(position).day);
         holder.degree.setText(degree);
         holder.image.setImageResource(list.get(position).image);
         setBackground(holder,list.get(position).color);
         holder.itemView.setOnClickListener(v->{
             itemClickListener.onItemClick(list.get(position));
         });
    }
    private void setBackground(@NonNull MyViewHolder holder,int color){
        switch (color){
            case 1:
                holder.cardView.getBackground().setTint((Color.parseColor("#28e0ae")));
                break;
            case 2:
                holder.cardView.getBackground().setTint((Color.parseColor("#ff0090")));
                break;
            case 3:
            default:
                holder.cardView.getBackground().setTint((Color.parseColor("#ffae00")));
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder{
        TextView day;
        TextView degree;
        ImageView image;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.cardView_template);
            day=itemView.findViewById(R.id.day_template);
            degree=itemView.findViewById(R.id.degree_template);
            image=itemView.findViewById(R.id.weatherImage_template);
        }
    }
}
