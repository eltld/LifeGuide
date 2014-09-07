package com.example.LifeGuide;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    private Button btn_lan_cn, btn_lan_en;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        setupViewComponent();
    }

    private void setupViewComponent() {
        btn_lan_cn = (Button) this.findViewById(R.id.btn_main_lan_cn);
        btn_lan_en = (Button) this.findViewById(R.id.btn_main_lan_en);

        btn_lan_cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
                Configuration configuration = getBaseContext().
                        getResources().getConfiguration();
                configuration.locale = Locale.SIMPLIFIED_CHINESE;
                getBaseContext().getResources().updateConfiguration(configuration,
                        getBaseContext().getResources().getDisplayMetrics());
                Intent mIntent = new Intent();
                mIntent.setClass(getApplicationContext(),MyActivity.class);
                mIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mIntent);
                startActivity(new Intent(MyActivity.this, MainActivity.class));
            }
        });
        btn_lan_en = (Button) this.findViewById(R.id.btn_main_lan_en);
        btn_lan_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Locale.setDefault(Locale.ENGLISH);
                Configuration configuration = getBaseContext().
                        getResources().getConfiguration();
                configuration.locale = Locale.ENGLISH;
                getBaseContext().getResources().updateConfiguration(configuration,
                        getBaseContext().getResources().getDisplayMetrics());
                Intent mIntent = new Intent();
                mIntent.setClass(getApplicationContext(),MyActivity.class);
                mIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(mIntent);
                startActivity(new Intent(MyActivity.this, MainActivity.class));
            }
        });
    }
}
