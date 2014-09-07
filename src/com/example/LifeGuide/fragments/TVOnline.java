package com.example.LifeGuide.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.VideoView;
import com.example.LifeGuide.R;
import com.example.LifeGuide.adapters.tvOnlineAdapter;
import com.example.LifeGuide.entitys.TvCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刚 on 2014/8/30.
 */
public class TVOnline extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_tv_online,container,false);

        VideoView videoView = (VideoView)view.findViewById(R.id.view_tv_online);
        GridView gridView = (GridView)view.findViewById(R.id.gridView);
        List<TvCategory> list = new ArrayList<TvCategory>();
        list.add(new TvCategory("1","s"));
        list.add(new TvCategory("2","s"));
        list.add(new TvCategory("3","s"));
        list.add(new TvCategory("4","s"));
        gridView.setAdapter(new tvOnlineAdapter(getActivity(),R.layout.item_of_tv_online,list));
        return view;
    }
}
