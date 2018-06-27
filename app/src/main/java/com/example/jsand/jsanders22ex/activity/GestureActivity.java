package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GestureActivity extends BaseActivity implements View.OnTouchListener
{
    @BindView(R.id.gesture_textView)
    TextView textView;

    private GestureDetector gestureDetector;
    private int sumX=0;
    private int sumY=0;
    private boolean isToast;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
        ButterKnife.bind(this);
        gestureDetector = new GestureDetector(this, new simpleGestureListener());
        textView.setOnTouchListener(this);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setLongClickable(true);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event)
    {
        return gestureDetector.onTouchEvent(event);
    }

    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener
    {
        boolean isToast = false;

        @Override
        public boolean onSingleTapUp(MotionEvent e)
        {
            LogUtil.LogD("Gesture","onSingleTapUp");
            return super.onSingleTapUp(e);
        }

        @Override
        public void onLongPress(MotionEvent e)
        {
            LogUtil.LogD("Gesture","onLongPress");
            super.onLongPress(e);
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
        {
            LogUtil.LogD("Gesture","onScroll");
            LogUtil.LogD("Gesture","distanceX:"+distanceX);
            LogUtil.LogD("Gesture","distanceY:"+distanceY);
            sumX+=distanceX;
            sumY+=distanceY;
            if(!isToast){
                if(sumX<0){
                    if(Math.abs(sumX)>1000){
                        isToast = true;
                        toastShort("You scroll from left to right");
                    }
                }
                if(sumX>0){
                    if(Math.abs(sumX)>1000){
                        isToast = true;
                        toastShort("You scroll from right to left");
                    }
                }

                if(sumY<0){
                    if(Math.abs(sumY)>1000){
                        isToast = true;
                        toastShort("You scroll from top to bottom");
                    }
                }
                if(sumY>0){
                    if(Math.abs(sumY)>1000){
                        isToast = true;
                        toastShort("You scroll from bottom to top");
                    }
                }
            }
            return super.onScroll(e1, e2, distanceX, distanceY);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
        {
            LogUtil.LogD("Gesture","onFling");
            return super.onFling(e1, e2, velocityX, velocityY);
        }

        @Override
        public boolean onDown(MotionEvent e)
        {
            LogUtil.LogD("Gesture","onDown");
            isToast=false;
            sumX=0;
            sumY=0;
            return super.onDown(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e)
        {
            LogUtil.LogD("Gesture","onDoubleTap");
            return super.onDoubleTap(e);
        }
    }
}
