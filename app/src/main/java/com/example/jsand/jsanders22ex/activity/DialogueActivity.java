package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.dialogue.customDialogue;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogueActivity extends BaseActivity {

    @BindView(R.id.dialogue_radiogroup)
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogue);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.dialogue_custom:
//                        customDialogue.CustomDialogEventListener listener = new customDialogue.CustomDialogEventListener() {
//                            public void onClickListener(String msg)
//                            {
//                                toastShort(msg);
//                            }
//                        };

//                        customDialogue dialog = new customDialogue(DialogueActivity.this, listener);
//                        dialog.show();
                        break;
                }
            }
        });
    }
}
