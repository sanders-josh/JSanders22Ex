package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.dialog.Quiz3Dialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz3Activity extends BaseActivity
{
    @OnClick(R.id.quiz3_dialog)
    public void showDialog()
    {
        Quiz3Dialog.IQuiz3DialogEventListener listener = new Quiz3Dialog.IQuiz3DialogEventListener() {
            @Override
            public void onYesClickListener(String msg)
            {
                toastShort(msg);
            }

            @Override
            public void onNoClickListener(String msg)
            {
                toastShort(msg);
            }

            @Override
            public void onExitClickListener(String msg)
            {
                toastShort(msg);
                close();
            }
        };
        Quiz3Dialog dialog = new Quiz3Dialog(Quiz3Activity.this, listener);
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        ButterKnife.bind(this);
    }

    public void close()
    {
        this.finish();
    }
}
