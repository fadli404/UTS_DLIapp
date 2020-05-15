package com.apps.fadli_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
/*
Nama : Wisuda Nur Fadli
NIM : 10117179
Kelas : IF5
Tanggal pengerjaan : 14-05-2020
 */

public class CustomAdaptorVertical extends RecyclerView.Adapter<CustomAdaptorVertical.MyViewHolder2> {
    private Context context2;
    private List<App2> app2;

    public CustomAdaptorVertical(Context context2, List<App2> app2) {
        this.context2 = context2;
        this.app2 = app2;
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView mText1,mText2;
        ImageView mImage2;
        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            mImage2 = itemView.findViewById(R.id.image2);
            mText1 = itemView.findViewById(R.id.text_2);
            mText2 = itemView.findViewById(R.id.text_3);
        }
    }
    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v2 = LayoutInflater.from(context2).inflate(R.layout.layout_list_item2,parent,false);
        return new MyViewHolder2(v2);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, int position) {

        App2 app = app2.get(position);
        holder.mImage2.setImageResource(app.getImage());
        holder.mText1.setText(app.getDes1());
        holder.mText2.setText(app.getDes2());

    }

    @Override
    public int getItemCount() {
        return app2.size();
    }

}
