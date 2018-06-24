package com.example.jsand.jsanders22ex.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Pair;

import java.util.List;

public class AdvancedPagerAdapter extends FragmentStatePagerAdapter
{
    private final List<Pair<String, Fragment>> fragmentList;

    public AdvancedPagerAdapter(FragmentManager fm, List<Pair<String, Fragment>> fragmentList)
    {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentList.get(position).second;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return fragmentList.get(position).first;
    }

    @Override
    public int getCount()
    {
        return fragmentList.size();
    }
}
