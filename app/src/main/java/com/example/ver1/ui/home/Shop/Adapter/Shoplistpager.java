package com.example.ver1.ui.home.Shop.Adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.ver1.ui.home.Shop.Shoplist.ShopAestheticFragment;
import com.example.ver1.ui.home.Shop.Shoplist.ShopeyebrowFragment;
import com.example.ver1.ui.home.Shop.Shoplist.ShopmakeupFragment;
import com.example.ver1.ui.home.Shop.Shoplist.ShopnailFragment;
import com.example.ver1.ui.home.Shop.Shoplist.ShopwaxFragment;

public class Shoplistpager extends FragmentPagerAdapter {

    public Shoplistpager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return ShopAestheticFragment.newInstance();
            case 1:
                return ShopmakeupFragment.newInstance();
            case 2:
                return ShopnailFragment.newInstance();
            case 3:
                return ShopwaxFragment.newInstance();
            case 4:
                return ShopeyebrowFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    //상단 탭 레이아웃 텍스트 선언
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "에스테틱";
            case 1:
                return "메이크업";
            case 2:
                return "네일아트";
            case 3:
                return "왁싱";
            case 4:
                return "속눈썹";


            default:
                return null;
        }
    }
}