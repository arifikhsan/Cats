/*
 * Created by Arif Ikhsanudin
 * On 8/12/19 3:22 PM
 */

package com.example.cats.base;
// Created by Arif Ikhsanudin on 8/12/2019.

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());
        setToolbar();
        initView();
        populateView();
    }

    protected abstract int getLayoutResourceId();

    protected abstract void setToolbar();

    protected abstract void initView();

    protected abstract void populateView();
}
