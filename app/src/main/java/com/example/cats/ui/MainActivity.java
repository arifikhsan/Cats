/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cats.R;
import com.example.cats.adapters.ListCatAdapter;
import com.example.cats.data.CatsData;
import com.example.cats.models.Cat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCats;
    private ArrayList<Cat> cats = new ArrayList<>();
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCats = findViewById(R.id.rv_cat);
        rvCats.setHasFixedSize(true);

        cats.addAll(CatsData.getArrayList());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvCats.setLayoutManager(new LinearLayoutManager(this));
        ListCatAdapter listCatAdapter = new ListCatAdapter(cats);
        rvCats.setAdapter(listCatAdapter);

        listCatAdapter.setOnItemClickCallback(new ListCatAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cat cat) {
                moveToCatDetailActivity(cat);
            }
        });
    }

    private void moveToCatDetailActivity(Cat cat) {
        Intent moveToCatDetailIntent = new Intent(this, CatDetailActivity.class);
        moveToCatDetailIntent.putExtra(CatDetailActivity.EXTRA_CAT, cat);
        startActivity(moveToCatDetailIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onMenuClick(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void onMenuClick(int selectedMenu) {
        if (selectedMenu == R.id.action_about) {
            showAboutMe();
        }
    }

    protected void showAboutMe() {
        startActivity(new Intent(this, AboutActivity.class));
    }
}
