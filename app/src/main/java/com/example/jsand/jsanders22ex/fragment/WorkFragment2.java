package com.example.jsand.jsanders22ex.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.MainListAdapter;

import java.util.ArrayList;
import java.util.List;

public class WorkFragment2 extends Fragment
{
    List<String> list = new ArrayList<String>();
    MainListAdapter adapter;
    private ListView listView;

    public WorkFragment2()
    {
//        list.add("Quiz1");
    }

    public static WorkFragment2 newInstance(String param1, String param2) {
        WorkFragment2 fragment = new WorkFragment2();
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
        Log.d("Fragment","WorkFragment2: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment","WorkFragment2: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment","WorkFragment2: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment","WorkFragment2: onStop");
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
