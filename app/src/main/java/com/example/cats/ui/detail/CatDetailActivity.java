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

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;
import com.example.cats.ui.detail.ListTemperamentAdapter;
import com.example.cats.models.Cat;

import java.util.ArrayList;

public class CatDetailActivity extends AppCompatActivity {
    public static final String EXTRA_CAT = "extra_cat";

    private RecyclerView rvTemperament;
    private ArrayList<String> temperament = new ArrayList<>();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        rvTemperament = findViewById(R.id.rv_temperament);

        ImageView imageView = findViewById(R.id.img_cat_detail);
        TextView tvName = findViewById(R.id.tv_name);
        TextView tvDescription = findViewById(R.id.tv_description);
        TextView tvChildFriendly = findViewById(R.id.tv_child_friendly);
        TextView tvDogFriendly = findViewById(R.id.tv_dog_friendly);
        TextView tvStrangerFriendly = findViewById(R.id.tv_stranger_friendly);
        TextView tvLifespan = findViewById(R.id.tv_lifespan);

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
            temperament.addAll(cat.getTemperament());
            showTemperamentList();
            tvLifespan.setText(cat.getLifeSpan() + " years.");
            tvDescription.setText(cat.getDescription());
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showTemperamentList() {
        rvTemperament.setLayoutManager(new  LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvTemperament.setAdapter(new ListTemperamentAdapter(temperament));
    }

    protected String getVocalConjunctionOf(String name) {
        return isVowel(name.charAt(0)) ? "an" : "a";
    }

    protected Boolean isVowel(char alphabet) {
        return "AIUEOaiueo".indexOf(alphabet) != -1;
    }
}
