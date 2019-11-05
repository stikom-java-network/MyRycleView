package com.example.mytask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv_nilai;
    ArrayList<Nilai> list_nilai = new ArrayList<>();
    Adapter br_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_nilai = findViewById(R.id.rv_nilai);
        br_adapter = new Adapter(MainActivity.this, list_nilai);

        prepareData();

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv_nilai.setLayoutManager(mLayoutManager);
        rv_nilai.setAdapter(br_adapter);
        br_adapter.notifyDataSetChanged();
    }

    private void prepareData() {

        Nilai m = new Nilai();
        m.setGambar(R.drawable.ic_launcher_background);
        m.setMatkul("Pemrograman Aplikasi Mobile");
        m.setSks(1);
        m.setTugas(100);
        m.setUts(100);
        m.setUas(100);
        list_nilai.add(m);

        m = new Nilai();
        m.setGambar(R.drawable.ic_launcher_background);
        m.setMatkul("Pemrograman Aplikasi Website");
        m.setSks(1);
        m.setTugas(90);
        m.setUts(20);
        m.setUas(100);
        list_nilai.add(m);

        m = new Nilai();
        m.setGambar(R.drawable.ic_launcher_background);
        m.setMatkul("Kualitas Data");
        m.setSks(3);
        m.setTugas(75);
        m.setUts(50);
        m.setUas(80);
        list_nilai.add(m);

        m = new Nilai();
        m.setGambar(R.drawable.ic_launcher_background);
        m.setMatkul("Integerasi Data");
        m.setSks(3);
        m.setTugas(50);
        m.setUts(50);
        m.setUas(80);
        list_nilai.add(m);

    }
}
