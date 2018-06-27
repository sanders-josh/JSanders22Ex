package com.example.jsand.jsanders22ex.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jsand.jsanders22ex.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HandlerActivity extends AppCompatActivity
{
    private Thread thread;

    @BindView(R.id.handler_edittext)
    EditText editText;

    @BindView(R.id.handler_download)
    Button btnDownload;

    @BindView(R.id.handler_count)
    Button btnCount;

    @OnClick(R.id.handler_count)
    public void countDown(View view)
    {
        if (btnCount.getText().toString().equals("Pause"))
        {
            String s = editText.getText().toString();
            runHandler.removeCallbacks(runnable);
            editText.setText(s);
            btnCount.setText("Count");
            return;
        }

        runHandler.postDelayed(runnable,1000);
    }

    Handler downloadHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            super.handleMessage(msg);
            switch (msg.what)
            {
                case 1:
                    btnDownload.setText("Started");
                    break;
                case 2:
                    btnDownload.setText("Downloading");
                    break;
                case 3:
                    btnDownload.setText("Finished");
                    break;
                case 4:
                    btnDownload.setText("Download");
                    break;
            }
        }
    };

    Handler runHandler = new Handler();

    Runnable runnable = new Runnable()
    {
        @Override
        public void run()
        {
            btnCount.setText("Pause");
            String s = editText.getText().toString();
            int number = Integer.valueOf(s);
            if (number > 0)
            {
                number -= 1;
            }
            editText.setText(String.valueOf(number));
            runHandler.postDelayed(runnable, 1000);
        }
    };

    @OnClick(R.id.handler_download)
    public void download(View view)
    {
        thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                Message msg1 = new Message();
                msg1.what = 1;
                downloadHandler.handleMessage(msg1);
                try
                {
                    thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Message msg2 = new Message();
                msg2.what = 2;
                downloadHandler.handleMessage(msg2);
                try
                {
                    thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Message msg3 = new Message();
                msg3.what = 3;
                downloadHandler.handleMessage(msg3);
                try
                {
                    thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Message msg4 = new Message();
                msg4.what = 4;
                downloadHandler.handleMessage(msg4);
            }
        });
        thread.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        ButterKnife.bind(this);
    }
}
