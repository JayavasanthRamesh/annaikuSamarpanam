package com.seetha.kavithai.annaikusamarpanam;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class SlidingPager extends FragmentActivity {

    static class SamplePagerItem {
        private final CharSequence mTitle;
        private final int mIndicatorColor;
        private final int mDividerColor;

        SamplePagerItem(CharSequence title, int indicatorColor, int dividerColor) {
            mTitle = title;
            mIndicatorColor = indicatorColor;
            mDividerColor = dividerColor;
        }

        CharSequence getTitle() {
            return mTitle;
        }

        int getIndicatorColor() {
            return mIndicatorColor;
        }

        int getDividerColor() {
            return mDividerColor;
        }
    }

    static final String LOG_TAG = "SlidingTabsColorsFragment";

    private SlidingTab slidingTab;

    private ViewPager mViewPager;

    private List<SamplePagerItem> mTabs = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab);

        mTabs.add(new SamplePagerItem(
                "முன்னுரை", // Title
                Color.BLUE, // Indicator color
                Color.GRAY // Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "குறுங்கவிதைகள்", // Title
                Color.RED, // Indicator color
                Color.GRAY // Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "காதல்கவிகள்", // Title
                Color.YELLOW, // Indicator color
                Color.GRAY // Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "பிற கவிதைகள்", // Title
                Color.GREEN, // Indicator color
                Color.GRAY // Divider color
        ));

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager()));

        slidingTab = (SlidingTab) findViewById(R.id.sliding_tabs);
        slidingTab.setViewPager(mViewPager);

        slidingTab.setCustomTabColorizer(new SlidingTab.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return mTabs.get(position).getIndicatorColor();
            }

            @Override
            public int getDividerColor(int position) {
                return mTabs.get(position).getDividerColor();
            }

        });
    }

    class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

        SampleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new Tab1();
                case 1:
                    return new Tab2();
                case 2:
                    return new Tab3();
                case 3:
                    return new Tab4();
            }
            return new Tab1();
        }

        @Override
        public int getCount() {
            return mTabs.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabs.get(position).getTitle();
        }

    }

}