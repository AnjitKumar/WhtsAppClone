package com.example.viewpager.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpager.Model.Whtsapp_List_Data;
import com.example.viewpager.R;


import java.util.List;

public class Whhtsapp_Data extends RecyclerView.Adapter<Whhtsapp_Data.MyViewHold>{
   Context rContext;
   private List<Whtsapp_List_Data>list;

   public Whhtsapp_Data(Context rContext,List<Whtsapp_List_Data>list){
       this.rContext=rContext;
       this.list=list;

   }
    @NonNull
    @Override
    public MyViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(rContext).inflate(R.layout.fragment_chat,parent,false);
        return new MyViewHold(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHold holder, int position) {
       holder.Name.setText(list.get(position).getName());
       holder.message.setText(list.get(position).getMessage());
       holder.time.setText(list.get(position).getTime());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHold extends RecyclerView.ViewHolder{
        AppCompatTextView Name;
        AppCompatTextView message;
        AppCompatTextView time;

        public MyViewHold(@NonNull View itemView) {
            super(itemView);
            Name=itemView.findViewById(R.id.Name);
       time=itemView.findViewById(R.id.time);
        }
    }
}
