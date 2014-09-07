package com.example.LifeGuide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.LifeGuide.R;
import com.example.LifeGuide.entitys.TvCategory;

import java.util.List;

/**
 * Created by 刚 on 2014/8/30.
 */
public class tvOnlineAdapter extends ArrayAdapter<TvCategory> {
    private LayoutInflater inflater;
    private int viewId;
    private List<TvCategory> mList;

    public tvOnlineAdapter(Context context, int resource, List<TvCategory> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
        mList = objects;
        viewId = resource;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public TvCategory getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null){
            view = inflater.inflate(viewId,null);
        }else {
            view = convertView;
        }
        ImageView img = (ImageView)view.findViewById(R.id.img_tv_logo);
        final TextView txt = (TextView)view.findViewById(R.id.txt_tv_category);
        img.setImageResource(R.drawable.tvc);
        txt.setText(mList.get(position).getCategory());
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"click"+txt.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
