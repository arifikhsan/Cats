/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:26 PM
 */

/*
 * Created by Arif Ikhsanudin
 * On 8/11/19 12:07 PM
 */

package com.example.cats.ui.about;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.cats.R;
import com.example.cats.base.BaseActivity;

public class AboutActivity extends BaseActivity {
    ImageView imgAbout;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_about;
    }

    @Override
    protected void setToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
        }
    }

    @Override
    protected void initView() {
        imgAbout = findViewById(R.id.img_about);
    }

    @Override
    protected void populateView() {
        populateImage();
    }

    private void populateImage() {
        Glide.with(this)
                .load(Uri.parse("file:///android_asset/images/arif_ikhsanudin.jpg"))
                .apply(new RequestOptions().override(200, 200))
                .into(imgAbout);
    }
}
