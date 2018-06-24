package com.example.jsand.jsanders22ex.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.dialog.CustomDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogActivity extends BaseActivity {

    private int checkedID;

    @OnClick(R.id.dialog_submit)
    public void submit(View view)
    {
        switch (checkedID)
        {
            case R.id.dialog_custom:
                CustomDialog.ICustomDialogEventListener listener = new CustomDialog.ICustomDialogEventListener() {
                    public void onClickListener(String msg)
                    {
                        toastShort(msg);
                    }
                };

                CustomDialog dialog = new CustomDialog(DialogActivity.this, listener);
                dialog.show();
                break;
        }
    }

    @BindView(R.id.dialog_radiogroup)
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkedID = checkedId;
            }
        });
    }
}
