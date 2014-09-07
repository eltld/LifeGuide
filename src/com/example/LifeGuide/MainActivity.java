package com.example.LifeGuide;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.LifeGuide.fragments.*;

/**
 * Created by 刚 on 2014/8/29.
 */
public class MainActivity extends Activity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contents);
        Log.i("language is : ",getString(R.string.lan));
        setupViewComponent();
    }
    private void setupViewComponent(){
        btn1 = (Button)this.findViewById(R.id.btn_cont_first);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBtnState();
                btn1.setBackgroundResource(R.drawable.text_bg);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_layout,new MovieRecommend());
                ft.commit();
            }
        });

        btn2 = (Button)this.findViewById(R.id.btn_cont_second);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBtnState();
                btn2.setBackgroundResource(R.drawable.text_bg);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_layout,new TVOnline());
                ft.commit();
            }
        });

        btn3 = (Button)this.findViewById(R.id.btn_cont_third);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBtnState();
                btn3.setBackgroundResource(R.drawable.text_bg);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_layout,new MovieChoose());
                ft.commit();
            }
        });

        btn4 = (Button)this.findViewById(R.id.btn_cont_fourth);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBtnState();
                btn4.setBackgroundResource(R.drawable.text_bg);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_layout,new HistoryServices());
                ft.commit();
            }
        });

        btn5 = (Button)this.findViewById(R.id.btn_cont_fifth);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initBtnState();
                btn5.setBackgroundResource(R.drawable.text_bg);
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                ft.replace(R.id.fragment_layout,new CateringServices());
                ft.commit();
            }
        });
    }
    private void initBtnState(){
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
    }
}
