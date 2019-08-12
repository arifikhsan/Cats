/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:26 PM
 */

/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui.detail;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;
import com.example.cats.base.BaseActivity;
import com.example.cats.models.Cat;

import java.util.ArrayList;

public class CatDetailActivity extends BaseActivity {
    public static final String EXTRA_CAT = "extra_cat";

    private RecyclerView rvTemperament;
    private ArrayList<String> temperament = new ArrayList<>();
    private ImageView imageView;
    private TextView tvName, tvDescription, tvChildFriendly, tvDogFriendly, tvStrangerFriendly, tvLifespan;

    @Override
    protected void setToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Cat");
        }
    }

    @Override
    protected void initView() {
        rvTemperament = findViewById(R.id.rv_temperament);
        imageView = findViewById(R.id.img_cat_detail);
        tvName = findViewById(R.id.tv_name);
        tvDescription = findViewById(R.id.tv_description);
        tvChildFriendly = findViewById(R.id.tv_child_friendly);
        tvDogFriendly = findViewById(R.id.tv_dog_friendly);
        tvStrangerFriendly = findViewById(R.id.tv_stranger_friendly);
        tvLifespan = findViewById(R.id.tv_lifespan);
    }

    @Override
    protected void populateView() {
        Cat cat = getIntent().getParcelableExtra(EXTRA_CAT);
        if (cat != null) {
            fillDetails(cat);
        }
    }

    @SuppressLint("SetTextI18n")
    private void fillDetails(Cat cat) {
        setActionBarTitle("Hello, We are " + getVocalConjunctionOf(cat.getName()) + " " + cat.getName() + " Cat");

        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(this);
        circularProgressDrawable.setStrokeWidth(5f);
        circularProgressDrawable.setCenterRadius(30f);
        circularProgressDrawable.start();

        Glide.with(this)
                .load(cat.getImage())
                .apply(new RequestOptions()
                        .placeholder(circularProgressDrawable)
                        .override(200, 200))
                .into(imageView);

        tvName.setText(cat.getName());
        tvChildFriendly.setText(cat.getChildFriendly().toString());
        tvDogFriendly.setText(cat.getDogFriendly().toString());
        tvStrangerFriendly.setText(cat.getStrangerFriendly().toString());
        temperament.addAll(cat.getTemperament());
        showTemperamentList();
        tvLifespan.setText(cat.getLifeSpan() + " years.");
        tvDescription.setText(cat.getDescription());
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showTemperamentList() {
        rvTemperament.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvTemperament.setAdapter(new ListTemperamentAdapter(temperament));
    }

    protected String getVocalConjunctionOf(String name) {
        return isVowel(name.charAt(0)) ? "an" : "a";
    }

    protected Boolean isVowel(char alphabet) {
        return "AIUEOaiueo".indexOf(alphabet) != -1;
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_cat_detail;
    }
}
