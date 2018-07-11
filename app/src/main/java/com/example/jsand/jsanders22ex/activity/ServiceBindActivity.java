package com.example.jsand.jsanders22ex.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jsand.jsanders22ex.R;

import butterknife.OnClick;

public class ServiceBindActivity extends AppCompatActivity
{
    private ServiceConnection conn = new ServiceConnection()
    {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service)
        {

        }

        @Override
        public void onServiceDisconnected(ComponentName name)
        {

        }
    };

    @OnClick(R.id.service_bind_button)
    public void bind(View view)
    {

    }

    @OnClick(R.id.service_unbind_button)
    public void unbind(View view)
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_bind);
    }
}
