package com.example.jsand.jsanders22ex.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.R;

public class IntentAndBundleActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_and_bundle);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("B");
        String bundle_msg = bundle.getString("B_Msg");
        int number = intent.getIntExtra("No",0);
        String msg = intent.getStringExtra("Msg");
        Toast.makeText(this, String.valueOf(number), Toast.LENGTH_SHORT).show();
        textview = findViewById(R.id.intent_textview);
        textview.setText(bundle_msg);

    }
}
