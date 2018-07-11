package com.example.jsand.jsanders22ex.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jsand.jsanders22ex.R;

public class SingleInstanceActivity extends BaseActivity {

    private Button standard;
    private Button singleTop;
    private Button singleTask;
    private Button singleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("MSG");
        toastShort(msg);

        standard = findViewById(R.id.singleinstance_standard_button);
        singleTop = findViewById(R.id.singleinstance_singletop_button);
        singleTask = findViewById(R.id.singleinstance_singletask_button);
        singleInstance = findViewById(R.id.singleinstance_singleinstance_button);

        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });

        singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });

        singleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        singleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleInstanceActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent)
    {
        String msg = intent.getStringExtra("MSG");
        toastShort(msg);
    }
}
