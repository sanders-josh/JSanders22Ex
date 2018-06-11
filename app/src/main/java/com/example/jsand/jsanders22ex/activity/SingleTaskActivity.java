package com.example.jsand.jsanders22ex.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jsand.jsanders22ex.R;

public class SingleTaskActivity extends AppCompatActivity {

    private Button standard;
    private Button singleTop;
    private Button singleTask;
    private Button singleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);

        standard = findViewById(R.id.singletask_standard_button);
        singleTop = findViewById(R.id.singletask_singletop_button);
        singleTask = findViewById(R.id.singletask_singletask_button);
        singleInstance = findViewById(R.id.singletask_singleinstance_button);

        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, StandardActivity.class);
                startActivity(intent);
            }
        });

        singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleTopActivity.class);
                startActivity(intent);
            }
        });

        singleTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleTaskActivity.class);
                startActivity(intent);
            }
        });

        singleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(SingleTaskActivity.this, SingleInstanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
