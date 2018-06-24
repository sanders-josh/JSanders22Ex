package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.example.jsand.jsanders22ex.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RadioGroupActivity extends BaseActivity {

    private int checkedId;
    @BindView(R.id.radio_radio_group)
    RadioGroup radioGroup;

    @OnClick(R.id.radio_group_button)
    public void submit(View view)
    {
        switch (checkedId)
        {
            case R.id.radio_button1:
                toastShort("You choose 1");
                break;
            case R.id.radio_button2:
                toastShort("You choose 2");
                break;
            case R.id.radio_button3:
                toastShort("You choose 3");
                break;
            default:
                toastShort("You choose nothing");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioGroupActivity.this.checkedId = checkedId;
            }
        });
    }
}
