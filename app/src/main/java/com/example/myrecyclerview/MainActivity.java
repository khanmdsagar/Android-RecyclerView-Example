package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String product_name[];
    String product_price[];
    int product_image[] = {
            R.drawable.bag,
            R.drawable.belt,
            R.drawable.hoodie,
            R.drawable.jacket,
            R.drawable.ring,
            R.drawable.shoe,
            R.drawable.sunglass,

            R.drawable.bag,
            R.drawable.belt,
            R.drawable.hoodie,
            R.drawable.jacket,
            R.drawable.ring,
            R.drawable.shoe,
            R.drawable.sunglass,

            R.drawable.bag,
            R.drawable.belt,
            R.drawable.hoodie,
            R.drawable.jacket,
            R.drawable.ring,
            R.drawable.shoe,
            R.drawable.sunglass,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        product_name = getResources().getStringArray(R.array.product_name);
        product_price = getResources().getStringArray(R.array.product_price);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, product_name, product_price, product_image);

        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}