package com.ahamed.weatherforcasting.onBoardingScreen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;

import com.ahamed.weatherforcasting.R;
import com.ahamed.weatherforcasting.RecyclerView.Data;
import com.ahamed.weatherforcasting.RecyclerView.ItemClickListener;

public class onBoard_Screen1 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_board__screen1, container, false);
    }
}