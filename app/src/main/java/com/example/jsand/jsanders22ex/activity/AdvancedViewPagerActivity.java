package com.example.jsand.jsanders22ex.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.AdvancedPagerAdapter;
import com.example.jsand.jsanders22ex.fragment.DemoFragment;
import com.example.jsand.jsanders22ex.fragment.WorkFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvancedViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.advanced_viewpager_title)
    TabLayout title;
    @BindView(R.id.advanced_viewpager)
    ViewPager viewPager;

    private List<Pair<String, Fragment>> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_view_pager);
        ButterKnife.bind(this);

        fragmentList.add(new Pair<String, Fragment>("First",new WorkFragment()));
        fragmentList.add(new Pair<String, Fragment>("Second", new DemoFragment()));
        fragmentList.add(new Pair<String, Fragment>("Third", new WorkFragment()));
        fragmentList.add(new Pair<String, Fragment>("Fourth", new DemoFragment()));

        AdvancedPagerAdapter adapter = new AdvancedPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);
        title.setupWithViewPager(viewPager);
    }
}
