package com.example.ver1.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ver1.R;

public class ReviewEditActivity extends AppCompatActivity {

    private View view;
    private Button button1;
    private RecyclerView recyclerView;
    private EditText editText1, editText2;

    @Nullable
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_reviewedit);
        getSupportActionBar().hide(); // 액션바 삭제

    }
}

