/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui;

import android.annotation.SuppressLint;
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
    TextView tvName, tvChildFriendly, tvDogFriendly, tvStrangerFriendly, tvDescription;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        imageView = findViewById(R.id.img_cat_detail);
        tvName = findViewById(R.id.tv_name);
        tvDescription = findViewById(R.id.tv_description);
        tvChildFriendly = findViewById(R.id.tv_child_friendly);
        tvDogFriendly = findViewById(R.id.tv_dog_friendly);
        tvStrangerFriendly = findViewById(R.id.tv_stranger_friendly);

        Cat cat = getIntent().getParcelableExtra(EXTRA_CAT);
        if (cat != null) {
            setActionBarTitle("Hello, We are " + getVocalConjunctionOf(cat.getName()) + " " + cat.getName() + " Cat");
            Glide.with(this)
                    .load(cat.getImage())
                    .apply(new RequestOptions().override(200, 200))
                    .into(imageView);

            tvName.setText(cat.getName());
            tvChildFriendly.setText(cat.getChildFriendly().toString());
            tvDogFriendly.setText(cat.getDogFriendly().toString());
            tvStrangerFriendly.setText(cat.getStrangerFriendly().toString());
            tvDescription.setText(cat.getDescription());
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    protected String getVocalConjunctionOf(String name) {
        return isVowel(name.charAt(0)) ? "an" : "a";
    }

    protected Boolean isVowel(char alphabet) {
        return "AIUEOaiueo".indexOf(alphabet) != -1;
    }
}
