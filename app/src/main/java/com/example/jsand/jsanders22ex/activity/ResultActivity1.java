package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jsand.jsanders22ex.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ResultActivity1 extends BaseActivity
{
    public final static int ID = 1111;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStop()
    {
        setResult(200);
        super.onStop();
    }
}
