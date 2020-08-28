package com.example.ver1.ui.home.Shop.Shoplist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class ShopeyebrowFragment extends Fragment {
    private View view;

    public static ShopeyebrowFragment newInstance() {
        ShopeyebrowFragment shopeyebrowFragment = new ShopeyebrowFragment();
        return shopeyebrowFragment;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabshop_intro, container, false);
        return view;
    }
}