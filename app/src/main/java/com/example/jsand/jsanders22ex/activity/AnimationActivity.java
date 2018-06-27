package com.example.jsand.jsanders22ex.activity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivity
{
    private Animation transAnimation;
    private Animation alphaAnimation;
    private Animation rotateAnimation;
    private Animation scaleAnimation;
    private Animation setAnimation;


    @BindView(R.id.activity_animation_textview)
    TextView textView;

    @OnClick(R.id.activity_animation_textview)
    public void textClick(View view)
    {
        toastShort("AnimationTest");
    }

    @OnClick(R.id.activity_animation_trans)
    public void trans(View view)
    {
        textView.startAnimation(transAnimation);
    }

    @OnClick(R.id.activity_animation_alpha)
    public void alpha(View view)
    {
        textView.startAnimation(alphaAnimation);
    }

    @OnClick(R.id.activity_animation_rotate)
    public void rotate(View view)
    {
        textView.startAnimation(rotateAnimation);
    }

    @OnClick(R.id.activity_animation_scale)
    public void scale(View view)
    {
        textView.startAnimation(scaleAnimation);
    }

    @OnClick(R.id.activity_animation_set)
    public void set(View view)
    {
        textView.startAnimation(setAnimation);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initAnimation();
    }

    private void initAnimation()
    {
        transAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_trans);
        alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        rotateAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        scaleAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        setAnimation = AnimationUtils.loadAnimation(this,R.anim.anim_set);

    }
}
