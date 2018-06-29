package com.example.jsand.jsanders22ex.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.activity.Quiz2Activity;
import com.example.jsand.jsanders22ex.activity.Quiz3Activity;

public class WorkFragment extends Fragment
{
    private Button Quiz1;
    private Button Quiz2;
    private Button Quiz3;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment","WorkFragment: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment","WorkFragment: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment","WorkFragment: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment","WorkFragment: onStop");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_work, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        Quiz1 = getView().findViewById(R.id.fragment_work_quiz1_button);
        Quiz2 = getView().findViewById(R.id.fragment_work_quiz2_button);
        Quiz3 = getView().findViewById(R.id.fragment_work_quiz3_button);

        Quiz1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getContext(), "Quiz 1", Toast.LENGTH_SHORT).show();
            }
        });

        Quiz2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Quiz2Activity.class);
                startActivity(intent);
            }
        });

        Quiz3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Quiz3Activity.class);
                startActivity(intent);
            }
        });

    }

}
