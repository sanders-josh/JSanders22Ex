package com.example.jsand.jsanders22ex.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jsand.jsanders22ex.MainActivity;
import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.activity.Quiz1Activity;
import com.example.jsand.jsanders22ex.adapter.MainListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WorkFragment extends Fragment
{
    List<String> list = new ArrayList<String>();
    MainListAdapter adapter;
    private ListView listView;

    public WorkFragment()
    {
//        list.add("Quiz1");
    }

    public static WorkFragment newInstance(String param1, String param2) {
        WorkFragment fragment = new WorkFragment();
        return fragment;
    }

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
//        Intent intent = new Intent();
//        intent.setClass(getActivity(), Quiz1Activity.class);
//        startActivity(intent);
        return view;


    }

}
