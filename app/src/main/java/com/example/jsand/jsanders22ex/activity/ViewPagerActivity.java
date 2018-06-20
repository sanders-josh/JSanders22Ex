package com.example.jsand.jsanders22ex.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.ViewPagerAdapter;
import com.example.jsand.jsanders22ex.fragment.DemoFragment;
import com.example.jsand.jsanders22ex.fragment.WorkFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_pager);
        setContentView(R.layout.activity_view_pager);

        viewPager = findViewById(R.id.viewpager_viewpager);

        fragmentList.add(new DemoFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new WorkFragment());
        fragmentList.add(new WorkFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

    }
}
