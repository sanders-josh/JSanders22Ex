package com.example.jsand.jsanders22ex;

import android.app.Application;

import com.example.jsand.jsanders22ex.util.LogUtil;
//set as name in manifest so that this is called on start up instead of Application
public class MyApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        LogUtil.setLogSwitch(true); //true for development, false for release
    }
}
