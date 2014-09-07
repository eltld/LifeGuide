package com.example.LifeGuide.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.LifeGuide.R;

import java.util.zip.Inflater;

/**
 * Created by 刚 on 2014/8/29.
 */
public class MovieRecommend extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_movie_recommend,container,false);
        ImageView iv = (ImageView)view.findViewById(R.id.img_movie_recommend);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"click",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
