package com.example.jsand.jsanders22ex.activity;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.jsand.jsanders22ex.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HandlerActivity extends AppCompatActivity
{
    @BindView(R.id.handler_edittext)
    EditText editText;

    @OnClick
    public void countDown(View view)
    {
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
                  editText.setText("Started");
                  break;
              case 2:
                  editText.setText("Downloading");
                  break;
              case 3:
                  editText.setText("Finished");
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
            String s = editText.getText().toString();
            int number = Integer.valueOf(s);
            if (number > 0)
            {
                number -= 1;
            }
            editText.setText(String.valueOf(number));
            runHandler.postDelayed(runnable,1000);
        }
    };

    @OnClick(R.id.handler_download)
    public void download(View view)
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                //cannot update UI from non-UI thread
//                editText.setText("Start");
                Message msg1 = new Message();
                msg1.what = 1;
                downloadHandler.sendMessage(msg1);
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Message msg2 = new Message();
                msg2.what = 2;
                downloadHandler.sendMessage(msg2);
                try
                {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                Message msg3 = new Message();
                msg3.what = 3;
                downloadHandler.sendMessage(msg3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        ButterKnife.bind(this);
    }

    class DownloadThread extends Thread
    {
        @Override
        public void run()
        {
            super.run();

            try
            {
                editText.setText("Start");
                Thread.sleep(2000);
                editText.setText("Download");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
