package com.example.jsand.jsanders22ex.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity
{
    public void startActivity(@NonNull Class<?> cls)
    {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        startActivity(intent);
    }

    public void startActivity(@NonNull Class<?> cls, String key,String s)
    {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        intent.putExtra(key, s);
        startActivity(intent);
    }

    public void toastShort(String msg)
    {
        Toast.makeText(this, msg,Toast.LENGTH_SHORT);
    }

    public void toastLong(String msg)
    {
        Toast.makeText(this,msg,Toast.LENGTH_LONG);
    }
}
