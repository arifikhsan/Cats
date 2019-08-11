/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;

public class AboutActivity extends AppCompatActivity {
    ImageView imgAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
        }

        imgAbout = findViewById(R.id.img_about);

        Glide.with(this)
                .load(Uri.parse("file:///android_asset/images/arif_ikhsanudin.jpg"))
                .apply(new RequestOptions().override(200, 200))
                .into(imgAbout);
    }
}
