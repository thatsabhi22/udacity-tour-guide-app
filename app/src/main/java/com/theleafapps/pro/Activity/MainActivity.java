package com.theleafapps.pro.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.theleafapps.pro.Adpater.TourGuideFragmentPagerAdapter;
import com.theleafapps.pro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewpager);

        TourGuideFragmentPagerAdapter tourGuideFragmentPagerAdapter
                = new TourGuideFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(tourGuideFragmentPagerAdapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
