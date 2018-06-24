package com.example.jsand.jsanders22ex.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;

public class Quiz2Adapter extends BaseAdapter
{
    private LayoutInflater inflater;

    @Override
    public int getCount()
    {
        return 0;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.activity_quiz2, parent,false);
        }
        TextView textView = convertView.findViewById(R.id.activity_quiz2_textview);
        return textView;
    }
}
