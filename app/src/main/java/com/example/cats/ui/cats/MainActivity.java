/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:26 PM
 */

/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui.cats;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cats.R;
import com.example.cats.base.BaseActivity;
import com.example.cats.data.CatsData;
import com.example.cats.models.Cat;
import com.example.cats.ui.about.AboutActivity;
import com.example.cats.ui.detail.CatDetailActivity;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    private RecyclerView rvCats;
    private ArrayList<Cat> cats = new ArrayList<>();

    @Override
    protected void setToolbar() {
    }

    @Override
    protected void initView() {
        rvCats = findViewById(R.id.rv_cat);
        rvCats.setHasFixedSize(true);
    }

    @Override
    protected void populateView() {
        addCatsToList();
        showRecyclerList();
    }

    private void addCatsToList() {
        cats.clear();
        cats.addAll(CatsData.getArrayList());
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

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
