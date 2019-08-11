/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;
import com.example.cats.models.Cat;

public class CatDetailActivity extends AppCompatActivity {
    public static final String EXTRA_CAT = "extra_cat";

    ImageView imageView;
    TextView tvName, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        imageView = findViewById(R.id.img_cat_detail);
        tvName = findViewById(R.id.tv_name);
        tvDescription = findViewById(R.id.tv_description);

        Cat cat = getIntent().getParcelableExtra(EXTRA_CAT);
        if (cat != null) {
            Glide.with(this)
                    .load(cat.getImage())
                    .apply(new RequestOptions().override(200, 200))
                    .into(imageView);

            tvName.setText(cat.getName());
            tvDescription.setText(cat.getDescription());
        }
    }
}
