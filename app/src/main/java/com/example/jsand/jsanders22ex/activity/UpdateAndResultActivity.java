package com.example.jsand.jsanders22ex.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jsand.jsanders22ex.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class UpdateAndResultActivity extends BaseActivity
{

    @OnClick(R.id.result_update)
    public void update(View view)
    {
        startActivity(SingleInstanceActivity.class, "MSG", "newIntent");
    }

    @OnClick(R.id.result_activity1)
    public void toResultActivity1(View view)
    {
        Intent intent = new Intent();
        intent.setClass(this, ResultActivity1.class);
        startActivityForResult(intent, ResultActivity1.ID);
    }

    @OnClick(R.id.result_activity2)
    public void toResultActivity2(View view)
    {
        Intent intent = new Intent();
        intent.setClass(this, ResultActivity2.class);
        startActivityForResult(intent, ResultActivity2.ID);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_and_result);
        ButterKnife.bind(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        switch (requestCode)
        {
            case ResultActivity1.ID:
                if (resultCode == 200)
                {
                    toastShort("Come back from ResultActivity1");
                }
                break;
            case ResultActivity2.ID:
                toastShort("Come back from ResultActivity2");
                break;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
