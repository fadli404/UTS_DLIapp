package com.apps.fadli_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;
/*
Nama : Wisuda Nur Fadli
NIM : 10117179
Kelas : IF5
Tanggal pengerjaan : 14-05-2020
 */

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.MyViewHolder> {
    private Context context;
    private List<App> apps;

    public CustomAdaptor(Context context, List<App> apps) {
        this.context = context;
        this.apps = apps;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mName;
        ImageView mImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.name);
            mImage = itemView.findViewById(R.id.image);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_list_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        App app = apps.get(position);
        holder.mName.setText(app.getName());
        holder.mImage.setImageResource(app.getImage());

    }

    @Override
    public int getItemCount() {
        return apps.size();
    }


}
