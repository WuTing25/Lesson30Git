package com.wxd.android.landscreendemo2.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.wxd.android.landscreendemo2.R;

import java.util.ArrayList;
import java.util.List;


public class LeftFragment extends ListFragment {
    private ArrayAdapter<String> adapter;
    private List<String> data;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.data=getData();
        this.adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        this.setListAdapter(adapter);
    }


    public List<String> getData() {
        this.data = new ArrayList<>();
        for (int i=0;i<30;i++){
            this.data.add("小米"+i);
        }
        return this.data;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

    }
}
