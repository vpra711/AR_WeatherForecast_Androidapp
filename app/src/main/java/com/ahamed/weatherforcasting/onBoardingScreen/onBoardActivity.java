package com.ahamed.weatherforcasting.onBoardingScreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import com.ahamed.weatherforcasting.HomePage.NextWeek;
import com.ahamed.weatherforcasting.HomePage.Today;
import com.ahamed.weatherforcasting.HomePage.Tomorrow;
import com.ahamed.weatherforcasting.R;

public class onBoardActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        viewPager=findViewById(R.id.viewpager_onboard);
        viewPager.setAdapter(new onBoardadapter(onBoardActivity.this));
    }
    static class onBoardadapter extends FragmentStateAdapter {
        public onBoardadapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }
        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if(position==0)
                return new onBoard_Screen1();
            else if(position==1)
                return new onBoard_Screen2();
            return new onBoard_Screen3();
        }
        @Override
        public int getItemCount() {
            return 3;
        }
    }
}