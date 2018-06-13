package com.example.jsand.jsanders22ex.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.adapter.AdvancedListAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdvancedListViewActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> list = new ArrayList<String>();
    private AdvancedListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_list_view);
        listView = findViewById(R.id.advanced_listview);

        list.add("Hello!");
        list.add("Hi");
        list.add("How's it going?");
        list.add("Perfect.");

        listView = findViewById(R.id.advanced_listview);
        adapter = new AdvancedListAdapter(this,list);
    }
}
