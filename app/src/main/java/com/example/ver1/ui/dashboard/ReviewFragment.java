package com.example.ver1.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.ver1.R;

public class ReviewFragment extends Fragment {

    private View view;

    public static ReviewFragment newInstance() {
        ReviewFragment reviewFragment = new ReviewFragment();
        return reviewFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.tabtalk_review, container, false);
        return view;
    }
}

