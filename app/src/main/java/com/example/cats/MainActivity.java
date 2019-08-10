package com.example.cats;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cats.models.Cat;
import com.example.cats.models.CatsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewCats;
    private ArrayList<Cat> catList = new ArrayList<>();
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCats = findViewById(R.id.rv_cat);
        recyclerViewCats.setHasFixedSize(true);

        catList.addAll(CatsData.getArrayList());
        Log.d(TAG, "onCreate: " + catList.toString());
    }
}
