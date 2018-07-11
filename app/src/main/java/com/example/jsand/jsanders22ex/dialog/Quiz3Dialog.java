package com.example.jsand.jsanders22ex.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz3Dialog extends Dialog
{
    private int checkedId;

    @OnClick(R.id.dialog_radio_ok)
    public void onClick()
    {
        switch (checkedId)
        {
            case R.id.dialog_radio_yes:
                listener.onYesClickListener("Yes");
                dismiss();
                break;
            case R.id.dialog_radio_no:
                listener.onNoClickListener("No");
                dismiss();
                break;
            case R.id.dialog_radio_exit:
                listener.onExitClickListener("Exit");
                break;
            default:
        }
    }

    @OnClick(R.id.dialog_radio_cancel)
    public void cancel()
    {
        dismiss();
    }

    //Define variable of the listener
    private IQuiz3DialogEventListener listener;

    //Define interface: Listener
    public interface IQuiz3DialogEventListener
    {
        void onYesClickListener(String msg);
        void onNoClickListener(String msg);
        void onExitClickListener(String msg);
    }

    public Quiz3Dialog(@NonNull Context context, IQuiz3DialogEventListener listener)
    {
        super(context, R.style.dialog);
        //receive the listener from outside
        this.listener = listener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_radio);
        ButterKnife.bind(this);

        RadioGroup radioGroup = findViewById(R.id.dialog_radio_radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                Quiz3Dialog.this.checkedId = checkedId;
//                switch (checkedId)
//                {
//                    case R.id.dialog_radio_yes:
//                        ok.setOnClickListener(new View.OnClickListener()
//                        {
//                            @Override
//                            public void onClick(View v)
//                            {
//                                listener.onClickListener("Yes");
//                                dismiss();
//                            }
//                        });
//                        break;
//                    case R.id.dialog_radio_no:
//                        ok.setOnClickListener(new View.OnClickListener()
//                        {
//                            @Override
//                            public void onClick(View v)
//                            {
//                                listener.onClickListener("No");
//                                dismiss();
//                            }
//                        });
//                        break;
//                    case R.id.dialog_radio_exit:
//                        ok.setOnClickListener(new View.OnClickListener()
//                        {
//                            @Override
//                            public void onClick(View v)
//                            {
//                                listener.onClickListener("Exit");
//                            }
//                        });
//                        break;
//                }
            }
        });
    }
}
