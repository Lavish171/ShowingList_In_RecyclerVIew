package com.example.showing_list_in_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder>
{
    private String [] data;
    public MyAdapter(String []data)
    {
       this.data=data;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.listitems,parent,false);
        return new MyViewHolder(view);
    }
    public void onBindViewHolder(MyViewHolder holder, int position) {
     String title=data[position];
     holder.itemtitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView itemtitle;
        ImageView imageicon;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageicon=(ImageView) itemView.findViewById(R.id.imgicon);
        itemtitle=(TextView) itemView.findViewById(R.id.texttitle);
    }
}
}
