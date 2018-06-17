package com.example.jsand.jsanders22ex.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.ScaleTypeAdapter;

import java.util.ArrayList;
import java.util.List;

public class ScaleTypeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private View view1;
    private View view2;
    private View view3;
    private List<View> viewList = new ArrayList<View>();
    private ScaleTypeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_type);
        viewPager = findViewById(R.id.scale_type_viewpager);

        LayoutInflater lf = getLayoutInflater().from(this);
        view1 = lf.inflate(R.layout.scale_type_center_inside, null);
        view2 = lf.inflate(R.layout.scale_type_center, null);
        view3 = lf.inflate(R.layout.scale_type_center_crop, null);
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        adapter = new ScaleTypeAdapter(viewList);
        viewPager.setAdapter(adapter);
    }
}
