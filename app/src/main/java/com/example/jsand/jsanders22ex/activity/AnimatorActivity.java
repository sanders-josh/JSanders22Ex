package com.example.jsand.jsanders22ex.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimatorActivity extends BaseActivity
{
    private ValueAnimator repeatAnimator;

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
        repeatAnimator = doAnimatorListener();
//        repeatAnimator.setStartDelay(3000);
        repeatAnimator.start();
    }

    @OnClick(R.id.acivity_animator_cancel)
    public void cancelClick(View view)
    {
        repeatAnimator.cancel();
        repeatAnimator.removeAllListeners();
        repeatAnimator.removeAllUpdateListeners();
    }

    @OnClick(R.id.acivity_animator_trans)
    public void transClick(View view)
    {
        ObjectAnimator animator =
                ObjectAnimator.ofFloat(textView, "translationX", 0, 120); //translationY
        animator.setDuration(2000);
        animator.start();
    }

    @OnClick(R.id.acivity_animator_scale)
    public void scaleClick(View view)
    {
        ObjectAnimator animator =
                ObjectAnimator.ofFloat(textView, "scaleX", 0,3,1,2,5,1); //scaleY
        animator.setDuration(5000);
        animator.start();
    }

    @OnClick(R.id.acivity_animator_color)
    public void colorClick(View view)
    {
        ObjectAnimator animator =
                ObjectAnimator.ofInt
                        (textView, "BackgroundColor", 0xffff00ff, 0xffffff00, 0xffff00ff);
        animator.setDuration(8000);
        animator.setEvaluator(new ArgbEvaluator());
        animator.start();
    }

    @OnClick(R.id.acivity_animator_char)
    public void charClick(View view)
    {
        ValueAnimator animator =
                ValueAnimator.ofObject
                        (new CharEvaluator(),new Character('A'),new Character('Z'));
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                char text = (char)animation.getAnimatedValue();
                textView.setText(String.valueOf(text));
            }
        });
        animator.setDuration(10000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }

    @OnClick(R.id.acivity_animator_alpha)
    public void alphaClick(View view)
    {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView,"alpha",1,0,1);
        animator.setDuration(2000);
        animator.start();
    }

    @OnClick(R.id.acivity_animator_rotation)
    public void rotationClick(View view)
    {
        ObjectAnimator animator = ObjectAnimator.ofFloat(textView,"rotationY",0,360,0);//rotationX   rotationY
        animator.setDuration(4000);
        animator.setInterpolator(new AccelerateInterpolator());
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(2);
        animator.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);
        ButterKnife.bind(this);
    }

    private ValueAnimator doAnimatorListener(){
        ValueAnimator animator = ValueAnimator.ofInt(0,400);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int curValue = (int)animation.getAnimatedValue();
                textView.layout(textView.getLeft(),curValue,textView.getRight(),curValue+textView.getHeight());
            }
        });
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                toastShort("Started");
                LogUtil.LogD("Yan","animation start");
            }
            @Override
            public void onAnimationEnd(Animator animation) {
                toastShort("Ended");
                LogUtil.LogD("Yan","animation end");
            }
            @Override
            public void onAnimationCancel(Animator animation) {
                toastShort("Canceled");
                LogUtil.LogD("Yan","animation cancel");
            }
            @Override
            public void onAnimationRepeat(Animator animation) {
                toastShort("Repeated");
                LogUtil.LogD("Yan","animation repeat");
            }
        });
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.setRepeatCount(2);
//        animator.setInterpolator(new CycleInterpolator(10));
        animator.setDuration(2000);
        return animator;
    }

    private class CharEvaluator implements TypeEvaluator<Character>
    {
        @Override
        public Character evaluate(float fraction, Character startValue, Character endValue) {
            int startInt  = (int)startValue;
            int endInt = (int)endValue;
            int curInt = (int)(startInt + fraction *(endInt - startInt));
            char result = (char)curInt;
            return result;
        }
    }

    public class ArgbEvaluator implements TypeEvaluator {
        public Object evaluate(float fraction, Object startValue, Object endValue) {
            int startInt = (Integer) startValue;
            int startA = (startInt >> 24);//0x(A)ff(R)ff(G)ff(B)
            int startR = (startInt >> 16) & 0xff;
            int startG = (startInt >> 8) & 0xff;
            int startB = startInt & 0xff;
            int endInt = (Integer) endValue;
            int endA = (endInt >> 24);
            int endR = (endInt >> 16) & 0xff;
            int endG = (endInt >> 8) & 0xff;
            int endB = endInt & 0xff;
            return (int)((startA + (int)(fraction * (endA - startA))) << 24) |
                    (int)((startR + (int)(fraction * (endR - startR))) << 16) |
                    (int)((startG + (int)(fraction * (endG - startG))) << 8) |
                    (int)((startB + (int)(fraction * (endB - startB))));
        }
    }
}
