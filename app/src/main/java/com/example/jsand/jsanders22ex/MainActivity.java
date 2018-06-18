package com.example.jsand.jsanders22ex;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.activity.BaseActivity;
import com.example.jsand.jsanders22ex.activity.NinePatchActivity;
import com.example.jsand.jsanders22ex.fragment.DemoFragment;
import com.example.jsand.jsanders22ex.fragment.WorkFragment;
import com.example.jsand.jsanders22ex.util.LogUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{
    @BindView(R.id.main_title_bt_pic) Button picButton;
    @OnClick(R.id.main_title_bt_pic)
    public void submit(View view)
    {
        toastShort("PIC");
    }

    private Button orangeButton;
//    private Button pictureButton;
    private Button demoButton;
    private Button workButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initialView();
        setListener();
    }

    private void initialView()
    {
        orangeButton = findViewById(R.id.main_title_bt_org);
//        pictureButton = findViewById(R.id.main_title_bt_pic);
        demoButton = findViewById(R.id.main_tool_demo);
        demoButton.setTextColor(Color.RED);
        workButton = findViewById(R.id.main_tool_work);
    }

    private void setListener()
    {
        final DemoFragment demoFragment = new DemoFragment();
        final WorkFragment workFragment = new WorkFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, demoFragment).commit();

        orangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity.this, "Orange_Back!", Toast.LENGTH_SHORT).show();
            }
        });

//        pictureButton.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(MainActivity.this, "Picture Button!", Toast.LENGTH_SHORT).show();
////                startActivity(NinePatchActivity.class);
//                startActivity(NinePatchActivity.class, "TEST", "test");
////                Log.d("Log","log");
//                LogUtil.LogD("TEST", "test");
//            }
//        });

        demoButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                demoButton.setTextColor(Color.RED);
                workButton.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, demoFragment).commit();
            }
        });

        workButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                demoButton.setTextColor(Color.BLACK);
                workButton.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_layout, workFragment).commit();
            }
        });
    }
}
