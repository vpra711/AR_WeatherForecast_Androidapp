package com.ahamed.weatherforcasting.HomePage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.ahamed.weatherforcasting.R;

public class Tomorrow extends Fragment {

//    ImageButton cancel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_tomorrow, container, false);

//        cancel=view.findViewById(R.id.cancel);

//        cancel.setOnClickListener(v->{
//            FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
//            fragmentTransaction.replace(R.id.content_container,new Today());
//            fragmentTransaction.commit();
//        });
        return view;
    }
}
