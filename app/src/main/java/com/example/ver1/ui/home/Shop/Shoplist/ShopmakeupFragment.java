package com.example.ver1.ui.home.Shop.Shoplist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;
import com.example.ver1.ui.home.MakeupFragment;

public class ShopmakeupFragment extends Fragment {
    private View view;

    public static ShopmakeupFragment newInstance() {
        ShopmakeupFragment shopmakeupFragment = new ShopmakeupFragment();
        return shopmakeupFragment;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabshop_intro, container, false);
        return view;
    }
}