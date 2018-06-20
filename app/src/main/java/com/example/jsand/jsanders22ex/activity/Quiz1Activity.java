package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.R;

public class Quiz1Activity extends BaseActivity {

    private Button quiz1Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        quiz1Button = findViewById(R.id.activity_quiz1_quiz1_button);

        quiz1Button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(Quiz1Activity.this, "Quiz 1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
