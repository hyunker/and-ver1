package com.example.ver1.ui.home.Shop.Shoplist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ver1.MainActivity;
import com.example.ver1.R;

public class ReservationActivity extends AppCompatActivity {

    private Button btn;
    private ImageButton btn1, btn2;
    private Spinner spinner;
    private CalendarView mCalendarView;
    private TextView whenDate, timeDate;
    private TimePicker mTimePicker;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);


        btn=findViewById(R.id.btn_reservation2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ReservationActivity.this, MainActivity.class);
                startActivity(in);
            }

        });

        btn1=findViewById(R.id.imageButton);
        mCalendarView=findViewById(R.id.calendarview);
        mCalendarView.setVisibility(View.INVISIBLE); // 기존에 보이지않게만듬.
        mCalendarView.bringToFront(); // 뷰에서 자신 최상위

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // 클릭이벤트 : 가시성
                if(mCalendarView.getVisibility() == View.VISIBLE)
                    mCalendarView.setVisibility(View.INVISIBLE); // or GONE
                else
                    mCalendarView.setVisibility(View.VISIBLE);
            }

        });

        spinner = (Spinner)findViewById(R.id.sp_menu); // 스피너

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mCalendarView = findViewById(R.id.calendarview);
        whenDate = findViewById(R.id.textView21);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() // 날짜 선택 이벤트
        {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth)
            {
                String date = year + " / " + (month + 1) + " / " + dayOfMonth;
                whenDate.setText(date); // 선택한 날짜로 설정

            }
        });

        btn2=findViewById(R.id.imageButton2);
        mTimePicker = findViewById(R.id.TimePicker);
        timeDate = findViewById(R.id.textView26);
        mTimePicker.setVisibility(View.INVISIBLE); // 기존에 보이지않게만듬.
        mTimePicker.setIs24HourView(false);
        mTimePicker.bringToFront();


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // 클릭이벤트 : 가시성
                if(mTimePicker.getVisibility() == View.VISIBLE)
                    mTimePicker.setVisibility(View.INVISIBLE); // or GONE
                else
                    mTimePicker.setVisibility(View.VISIBLE);
            }

        });

        mTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                String date = hourOfDay + "시  " + minute + "분 ";
                timeDate.setText(date); // 선택한 시간으로 보여짐
            }
        });

    }
    public void btnClick(View view) {
        Toast.makeText(this, "예약이 완료되었습니다.", Toast.LENGTH_SHORT).show();
    }
}