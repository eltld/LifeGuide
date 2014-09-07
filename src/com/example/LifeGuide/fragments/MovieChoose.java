package com.example.LifeGuide.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.LifeGuide.R;

/**
 * Created by 刚 on 2014/8/30.
 */
public class MovieChoose extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_movie_choose,container,false);
        return view;
    }
}
