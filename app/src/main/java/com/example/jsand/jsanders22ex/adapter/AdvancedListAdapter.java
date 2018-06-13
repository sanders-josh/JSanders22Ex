package com.example.jsand.jsanders22ex.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jsand.jsanders22ex.R;

import java.util.List;

public class AdvancedListAdapter extends BaseAdapter {

    private final Context context;
    private final LayoutInflater inflater;
    private List<String> list;

    public AdvancedListAdapter(Context context, List<String> list)
    {
        this.context = context;
        this.list = list;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.item_advanced_listview, parent, false);
        }
        TextView textView = convertView.findViewById(R.id.item_advanced_listview_textview);
        textView.setText(list.get(position));

        return convertView;
    }
}
