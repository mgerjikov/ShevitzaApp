package com.example.android.shevitzaapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivityShevitza extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter customSwipeAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shevitza);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        customSwipeAdapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(customSwipeAdapter);
    }
}
