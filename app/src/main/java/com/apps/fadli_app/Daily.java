package com.apps.fadli_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;
/*
Nama : Wisuda Nur Fadli
NIM : 10117179
Kelas : IF5
Tanggal pengerjaan : 15-05-2020
 */

public class Daily extends AppCompatActivity {
    RecyclerView mList1,mList2;
    List<App> appList;
    List<App2> appList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        mList1 = findViewById(R.id.list1);
        mList2 = findViewById(R.id.list2);
        appList = new ArrayList<>();
        appList.add(new App(R.drawable.budi,"Budi"));
        appList.add(new App(R.drawable.jaka,"Jaka"));
        appList.add(new App(R.drawable.nova,"Nova"));
        appList.add(new App(R.drawable.novi,"Novi"));
        appList.add(new App(R.drawable.siti,"Siti"));
        appList.add(new App(R.drawable.dedi,"Dedi"));
        appList.add(new App(R.drawable.asep,"Asep"));
        appList.add(new App(R.drawable.yaya,"Yaya"));
        appList.add(new App(R.drawable.lufy,"Lufy"));
        appList.add(new App(R.drawable.zoro,"Zoro"));
        appList.add(new App(R.drawable.usop,"Usop"));
        appList.add(new App(R.drawable.mili,"Mili"));
        appList.add(new App(R.drawable.mala,"Mala"));
        appList.add(new App(R.drawable.vivi,"Vivi"));
        appList.add(new App(R.drawable.vina,"Vina"));
        appList2 = new ArrayList<>();
        appList2.add(new App2(R.drawable.aksi,"04:00","Santap Sahur"));
        appList2.add(new App2(R.drawable.aksi,"04:30","Shalat Subuh"));
        appList2.add(new App2(R.drawable.aksi,"05:00","Tidur"));
        appList2.add(new App2(R.drawable.aksi,"08:00","Mandi Pagi"));
        appList2.add(new App2(R.drawable.aksi,"09:00","Bermain Video Games"));
        appList2.add(new App2(R.drawable.aksi,"12:00","Shalat Dzuhur"));
        appList2.add(new App2(R.drawable.aksi,"12:30","Bermain Video Games"));
        appList2.add(new App2(R.drawable.aksi,"15:00","Shalat Ashar"));
        appList2.add(new App2(R.drawable.aksi,"15:30","Mandi Sore"));
        appList2.add(new App2(R.drawable.aksi,"16:00","Bermain Video Games"));
        appList2.add(new App2(R.drawable.aksi,"17:00","Menyiapkan Bukaan Untuk Buka Puasa"));
        appList2.add(new App2(R.drawable.aksi,"17:45","Buka Puasa Bersama Keluarga"));
        appList2.add(new App2(R.drawable.aksi,"18:25","Shalat Magrib"));
        appList2.add(new App2(R.drawable.aksi,"19:00","Shalat Isya"));
        appList2.add(new App2(R.drawable.aksi,"19:15","Shalat Tarawih Bersama Keluarga"));
        appList2.add(new App2(R.drawable.aksi,"20:00","Mengaji"));
        appList2.add(new App2(R.drawable.aksi,"20:30 - 23:59","Mengerjakan Tugas yang Ada"));

        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        LinearLayoutManager manager2 = new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.VERTICAL);
        mList2.setLayoutManager(manager2);

        CustomAdaptor adaptor1 = new CustomAdaptor(this,appList);
        mList1.setAdapter(adaptor1);
        CustomAdaptorVertical adaptor = new CustomAdaptorVertical(this,appList2);
        mList2.setAdapter(adaptor);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.daily);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MenuUtama.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.daily:
                        return true;
                    case R.id.gallery:
                        startActivity(new Intent(getApplicationContext(),Gallery.class));
                        overridePendingTransition(0,0);
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
