package com.example.jsand.jsanders22ex.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ScaleTypeAdapter extends PagerAdapter {


    private final List<View> viewList;

    public ScaleTypeAdapter(List<View> viewList)
    {
        this.viewList = viewList;
    }
    
    @Override
    public int getCount() {
        Log.d("Trace","getCount");
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position)
    {
        container.addView(viewList.get(position), 0);
        return viewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object)
    {
        container.removeView(viewList.get(position));
        Log.e("Trace", "destroyItem");
    }
}
