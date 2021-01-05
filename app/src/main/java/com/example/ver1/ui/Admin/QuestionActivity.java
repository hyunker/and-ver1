package com.example.ver1.ui.Admin;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ver1.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestionActivity extends AppCompatActivity {

    ExpandableListViewAdapter listViewAdapter;
    ExpandableListView expandableListView;
    List<String> questionList;
    HashMap<String, List<String>> questionanswerList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        expandableListView = findViewById(R.id.eListView);

        showList();

        listViewAdapter = new ExpandableListViewAdapter(this, questionList, questionanswerList);
        expandableListView.setAdapter(listViewAdapter);



    }

    private void showList() {
        questionList = new ArrayList<String>();
        questionanswerList = new HashMap<String, List<String>>();

        questionList.add("이게뭐에요? ");
        questionList.add("김현중이 뭔가요? ");

        List<String> topic1 = new ArrayList<>();
        topic1.add("다해줄게");



        List<String> topic2 = new ArrayList<>();
        topic2.add("이거만든애요");



        questionanswerList.put(questionList.get(0), topic1);
        questionanswerList.put(questionList.get(1), topic2);
    }
}
