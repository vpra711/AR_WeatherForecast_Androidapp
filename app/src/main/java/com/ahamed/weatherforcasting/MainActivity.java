package com.ahamed.weatherforcasting;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.ahamed.weatherforcasting.HomePage.HomePageAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);



        viewPager.setAdapter(new HomePageAdapter(this));
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch(position){
                case 0:
                       tab.setText("Today");
                       break;
                case 1:
                       tab.setText("Tomorrow");
                       break;
                default:
                       tab.setText("Next Week");
            }
        }).attach();
    }
}