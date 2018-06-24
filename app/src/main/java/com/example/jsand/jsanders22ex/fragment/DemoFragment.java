package com.example.jsand.jsanders22ex.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jsand.jsanders22ex.MainActivity;
import com.example.jsand.jsanders22ex.R;
import com.example.jsand.jsanders22ex.activity.AdvancedListViewActivity;
import com.example.jsand.jsanders22ex.activity.AdvancedViewPagerActivity;
import com.example.jsand.jsanders22ex.activity.CheckBoxActivity;
import com.example.jsand.jsanders22ex.activity.DialogActivity;
import com.example.jsand.jsanders22ex.activity.IntentAndBundleActivity;
import com.example.jsand.jsanders22ex.activity.LaunchModeActivity;
import com.example.jsand.jsanders22ex.activity.NinePatchActivity;
import com.example.jsand.jsanders22ex.activity.NotificationActivity;
import com.example.jsand.jsanders22ex.activity.RadioGroupActivity;
import com.example.jsand.jsanders22ex.activity.ScaleTypeActivity;
import com.example.jsand.jsanders22ex.activity.ViewPagerActivity;
import com.example.jsand.jsanders22ex.adapter.MainListAdapter;
import com.example.jsand.jsanders22ex.bean.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DemoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DemoFragment extends Fragment {

    public List<String> list = new ArrayList<String>();
    public MainListAdapter adapter;
    private ListView listView;
//commit test
    public DemoFragment()
    {
        list.add("LaunchMode");
        list.add("SimpleViewPager");
        list.add("9Patch");
        list.add("ScaleType");
        list.add("Intent&Bundle");
        list.add("Notification");
        list.add("AdvancedListView");
        list.add("AdvancedViewPager");
        list.add("RadioGroup");
        list.add("CheckBox");
        list.add("Dialogs");
    }

    public static DemoFragment newInstance(String param1, String param2)
    {
        DemoFragment fragment = new DemoFragment();
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
        Log.d("Fragment","DemoFragment: onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment","DemoFragment: onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment","DemoFragment: onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment","DemoFragment: onStop");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = view.findViewById(R.id.main_demo_listview);
        adapter = new MainListAdapter(getContext(), list);
        listView.setAdapter(adapter);
//        View headerView = new View(getActivity());
//        listView.addHeaderView(headerView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            Intent intent = new Intent();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        //go to activity LaunchMode
                        intent.setClass(getActivity(), LaunchModeActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.setClass(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent.setClass(getActivity(), NinePatchActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent.setClass(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent.setClass(getActivity(), IntentAndBundleActivity.class);
                        intent.putExtra("Msg", "Say Hello!");
                        intent.putExtra("No", 10);
                        Base newBase = new Base();
                        newBase.setName("Josh");
                        newBase.setAge(26);
                        Bundle bundle = new Bundle();
                        bundle.putInt("B_Msg",100);
                        bundle.putString("B_Msg","FromBundle");
                        bundle.putSerializable("Base",newBase);
                        intent.putExtra("B",bundle);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setClass(getActivity(), NotificationActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent.setClass(getActivity(), AdvancedListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        ((MainActivity)getActivity()).startActivity(AdvancedViewPagerActivity.class);
                        break;
                    case 8:
                        ((MainActivity)getActivity()).startActivity(RadioGroupActivity.class);
                        break;
                    case 9:
                        ((MainActivity)getActivity()).startActivity(CheckBoxActivity.class);
                        break;
                    case 10:
                        ((MainActivity)getActivity()).startActivity(DialogActivity.class);
                        break;
                    default:
                }
            }
        });
        return view;
    }

}
