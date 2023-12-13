package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;


import com.example.viewpager.Model.Dummy;
import com.google.android.material.tabs.TabLayout;

import com.example.viewpager.Adapter.Whhtsapp_Data;

public class Test_Activity extends AppCompatActivity {
    RecyclerView WhatsAppRecycle;
     Whhtsapp_Data WhatsAppAdapter;
    TabLayout tab;
    ViewPager viewpager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tab = findViewById(R.id.tab);
        viewpager = findViewById(R.id.viewpager);
        WhatsAppRecycle =findViewById(R.id.whtsappRecyle);
        PagerViewMessengerAdapter adapter = new PagerViewMessengerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(adapter);
        tab.setupWithViewPager(viewpager);
        WhatsAppAdapter =new Whhtsapp_Data(this,Dummy.getData());
        WhatsAppRecycle.setAdapter(WhatsAppAdapter);
    }

}