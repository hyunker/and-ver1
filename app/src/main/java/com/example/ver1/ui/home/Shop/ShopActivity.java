package com.example.ver1.ui.home.Shop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.ver1.R;
import com.example.ver1.ui.home.Shop.Adapter.Shoplistpager;
import com.google.android.material.tabs.TabLayout;


public class ShopActivity extends AppCompatActivity {
    private ImageButton btn5;
    private Shoplistpager fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        getSupportActionBar().hide(); // 액션바 삭제


        ViewPager viewPager = findViewById(R.id.vp_shoplist);
        fragmentPagerAdapter = new Shoplistpager(getSupportFragmentManager());


        TabLayout tabLayout = findViewById(R.id.tab_shoplist);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        btn5 = findViewById(R.id.button5);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShopActivity.this, ShopfilterActivity.class);
                startActivity(in);

            }
        });

    }
}

