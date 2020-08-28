package com.example.ver1.ui.home.Shop;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.viewpager.widget.ViewPager;
        import com.example.ver1.R;
        import com.example.ver1.ui.home.Shop.Adapter.ShopPagerAdapter;
        import com.example.ver1.ui.home.Shop.Shoplist.ReservationActivity;
        import com.example.ver1.ui.more.ChatActivity;
        import com.google.android.material.tabs.TabLayout;

public class ShopinfoActivity extends AppCompatActivity {

    private ShopPagerAdapter fragmentPagerAdapter;
    private Button btn, btn1;
    private View v;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopinfo);

        ViewPager viewPager = findViewById(R.id.tab_shopvp);
        fragmentPagerAdapter = new ShopPagerAdapter(getSupportFragmentManager());


        TabLayout tabLayout = findViewById(R.id.tab_shopinfo);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


        btn=findViewById(R.id.btn_reservation);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShopinfoActivity.this, ReservationActivity.class);
                startActivity(in);
            }

        });

        btn1=findViewById(R.id.btn_counseling);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ShopinfoActivity.this, ChatActivity.class);
                startActivity(in);
            }

        });

    }
}
