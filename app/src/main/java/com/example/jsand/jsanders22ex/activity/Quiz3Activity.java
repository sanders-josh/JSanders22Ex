package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jsand.jsanders22ex.R;

import butterknife.ButterKnife;

public class Quiz3Activity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        ButterKnife.bind(this);
    }
}
