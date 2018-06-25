package com.example.jsand.jsanders22ex.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.AdvancedListAdapter;
import com.example.jsand.jsanders22ex.adapter.ViewPagerAdapter;
import com.example.jsand.jsanders22ex.fragment.DemoFragment;
import com.example.jsand.jsanders22ex.fragment.WorkFragment;

import java.util.ArrayList;
import java.util.List;

public class Quiz2Activity extends AppCompatActivity
{
    private ListView listView;
    private List<String> list = new ArrayList<String>();
    private AdvancedListAdapter adapter;

    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        View view = getLayoutInflater().inflate(R.layout.listview_header, null);

        list.add("Hello!");
        list.add("Hi");
        list.add("How's it going?");
        list.add("Perfect.");
        list.add("Perfect.");
        list.add("Perfect.");
        list.add("Perfect.");
        list.add("Perfect.");
        list.add("Perfect.");

        listView = findViewById(R.id.activity_quiz2_listview);
        adapter = new AdvancedListAdapter(this,list);
        listView.setAdapter(adapter);
        listView.addHeaderView(view);

        viewPager = findViewById(R.id.activity_quiz2_viewpager);

        fragmentList.add(new DemoFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new DemoFragment());
        fragmentList.add(new WorkFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);
    }
}
