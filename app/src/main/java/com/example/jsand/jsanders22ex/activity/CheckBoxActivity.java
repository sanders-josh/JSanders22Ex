package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.example.jsand.jsanders22ex.R;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckBoxActivity extends BaseActivity {

    @BindView(R.id.checkbox1)
    CheckBox check1;

    @BindView(R.id.checkbox2)
    CheckBox check2;

    @BindView(R.id.checkbox3)
    CheckBox check3;

    @OnClick(R.id.check_submit)
    public void submit(View v)
    {
        String msg = "You checked: ";
        for (Map.Entry<Integer,Boolean> entry : checkList.entrySet())
        {
            if (entry.getValue())
            {
                switch (entry.getKey())
                {
                    case R.id.checkbox1:
                        msg+="CheckBox1";
                        break;
                    case R.id.checkbox2:
                        msg+="CheckBox2";
                        break;
                    case R.id.checkbox3:
                        msg+="CheckBox3";
                        break;
                    default:
                        msg+="Nothing";

                }
            }
        }
        toastShort(msg);
    }

    private Map<Integer,Boolean> checkList = new HashMap<Integer,Boolean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkList.put(buttonView.getId(), isChecked);
            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkList.put(buttonView.getId(), isChecked);
            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkList.put(buttonView.getId(), isChecked);
            }
        });
    }
}
