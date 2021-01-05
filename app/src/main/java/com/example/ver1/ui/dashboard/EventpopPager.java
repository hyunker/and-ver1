package com.example.ver1.ui.dashboard;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class EventpopPager extends FragmentPagerAdapter {

    public EventpopPager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return ReviewFragment.newInstance();
            case 1:
                return ReviewFragment.newInstance();
            case 2:
                return DesignbookFragmnet.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //상단 탭 레이아웃 텍스트 선언
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "솔직후기";
            case 1:
                return "동영상리뷰";
            case 2:
                return "디자인북";


            default:
                return null;
        }
    }
}