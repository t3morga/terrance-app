package com.example.t3morga.terrancemorganapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    mTextMessage.setText(Html.fromHtml(getString(R.string.home_text)));
                    return true;
                case R.id.navigation_experience:
                    mTextMessage.setText(Html.fromHtml(getString(R.string.experience_text)));
                    return true;
                case R.id.navigation_education:
                    mTextMessage.setText(Html.fromHtml(getString(R.string.education_text)));
                    return true;
                case R.id.navigation_certification:
                    mTextMessage.setText(Html.fromHtml(getString(R.string.certification_text)));
                    return true;
                case R.id.navigation_contact:
                    mTextMessage.setText(Html.fromHtml(getString(R.string.contact_text)));
                   // mTextMessage.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mTextMessage.setText(Html.fromHtml(getString(R.string.home_text)));
    }

}
