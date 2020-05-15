package com.apps.fadli_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;
/*
Nama : Wisuda Nur Fadli
NIM : 10117179
Kelas : IF5
Tanggal pengerjaan : 15-05-2020
 */

public class Gallery extends AppCompatActivity {
    private RecyclerView staggeredRV;
    private StaggeredRecyclerAdapter adapter;
    private StaggeredGridLayoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        staggeredRV = findViewById(R.id.staggered_rv);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRV.setLayoutManager(manager);

        List<row> lst = new ArrayList<>();
        lst.add(new row(R.drawable.foto_1));
        lst.add(new row(R.drawable.foto_2));
        lst.add(new row(R.drawable.foto_3));
        lst.add(new row(R.drawable.foto_4));
        lst.add(new row(R.drawable.foto_5));
        lst.add(new row(R.drawable.foto_6));
        lst.add(new row(R.drawable.foto_7));
        lst.add(new row(R.drawable.foto_8));
        lst.add(new row(R.drawable.foto_9));
        lst.add(new row(R.drawable.foto_10));

        adapter = new StaggeredRecyclerAdapter(this,lst);
        staggeredRV.setAdapter(adapter);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.gallery);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MenuUtama.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.daily:
                        startActivity(new Intent(getApplicationContext(),Daily.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.gallery:
                        return true;
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext(),Music.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),Profile.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
