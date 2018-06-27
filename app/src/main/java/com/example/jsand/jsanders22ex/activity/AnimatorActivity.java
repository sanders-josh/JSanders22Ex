package com.example.jsand.jsanders22ex.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimatorActivity extends BaseActivity
{

    @BindView(R.id.activity_animator_textView)
    TextView textView;

    @OnClick(R.id.activity_animator_textView)
    public void textClick(View view)
    {
        toastShort("Animator");
    }

    @OnClick(R.id.activity_animator_start)
    public void startClick(View view)
    {
        toastShort("Start");
    }

    @OnClick(R.id.acivity_animator_cancel)
    public void cancelClick(View view)
    {
        toastShort("Cancel");
    }

    @OnClick(R.id.acivity_animator_trans)
    public void transClick(View view)
    {
        toastShort("Trans");
    }

    @OnClick(R.id.acivity_animator_scale)
    public void scaleClick(View view)
    {
        toastShort("Scale");
    }

    @OnClick(R.id.acivity_animator_color)
    public void colorClick(View view)
    {
        toastShort("Color");
    }

    @OnClick(R.id.acivity_animator_char)
    public void charClick(View view)
    {
        toastShort("Char");
    }

    @OnClick(R.id.acivity_animator_alpha)
    public void alphaClick(View view)
    {
        toastShort("Alpha");
    }

    @OnClick(R.id.acivity_animator_rotation)
    public void rotationClick(View view)
    {
        toastShort("Rotation");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        ButterKnife.bind(this);
    }
}
