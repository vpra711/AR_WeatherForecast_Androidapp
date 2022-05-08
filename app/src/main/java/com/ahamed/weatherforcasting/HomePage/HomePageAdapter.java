package com.ahamed.weatherforcasting.HomePage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class HomePageAdapter extends FragmentStateAdapter {
    public HomePageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0)
            return new Today();
        else if(position==1)
            return new Tomorrow();
        return new NextWeek();
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
