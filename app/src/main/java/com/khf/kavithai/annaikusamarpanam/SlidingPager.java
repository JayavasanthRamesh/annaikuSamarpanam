package com.khf.kavithai.annaikusamarpanam;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

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

    private SlidingTab slidingTab;

    private ViewPager mViewPager;

    private List<SamplePagerItem> mTabs = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliding_tab);

        mTabs.add(new SamplePagerItem(
                "சமர்ப்பணம்",
                Color.RED,
                Color.GRAY
        ));

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
                "பிற கவிதைகள்", // Title
                Color.YELLOW, // Indicator color
                Color.GRAY // Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "காதல் கவிதைகள்", // Title
                Color.GREEN, // Indicator color
                Color.GRAY // Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "எனது பொன்மொழிகள்",
                Color.MAGENTA,
                Color.GRAY
        ));

        mTabs.add(new SamplePagerItem(
                "தானம்", //Title
                Color.LTGRAY, //Indicator color
                Color.GRAY //Divider color
        ));

        mTabs.add(new SamplePagerItem(
                "இதை பற்றி",
                Color.CYAN,
                Color.GRAY
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
                    return new Samarpanam();
                case 1:
                    return new Summary();
                case 2:
                    return new ShortPoems();
                case 3:
                    return new OtherPoems();
                case 4:
                    return new LovePoems();
                case 5:
                    return new Quotes();
                case 6:
                    return new Donation();
                case 7:
                    return new About();
            }
            return new Summary();
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

    public void gotoBlog(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setData(Uri.parse("http://annaikusamarppanam.blogspot.in"));
        startActivity(intent);
    }

    public void gotoFB(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setData(Uri.parse("https://www.facebook.com/faizaan.ceg"));
        startActivity(intent);
    }



}