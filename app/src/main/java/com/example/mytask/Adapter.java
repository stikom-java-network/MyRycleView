package com.example.mytask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Nilai> list_nilai = new ArrayList<>();

    public Adapter(Context mContext, ArrayList<Nilai> list_nilai) {
        this.mContext = mContext;
        this.list_nilai = list_nilai;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_row, parent, false);
        return new Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Nilai m = list_nilai.get(position);

        holder.Gambar.setImageResource(m.getGambar());
        holder.Matkul.setText(String.valueOf(m.getMatkul()));
        holder.sks.setText(String.valueOf(m.getSks()));
        holder.na.setText(String.valueOf(m.na()));
        holder.nh.setText(String.valueOf(m.nh(m.na())));

    }

    @Override
    public int getItemCount() {
        return list_nilai.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView Gambar;
        TextView Matkul, sks, na, nh;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Gambar = itemView.findViewById(R.id.img);
            Matkul = itemView.findViewById(R.id.txt_Matkul);
            sks = itemView.findViewById(R.id.txt_Sks);
            na = itemView.findViewById(R.id.NA);
            nh = itemView.findViewById(R.id.NH);

        }
    }

}

