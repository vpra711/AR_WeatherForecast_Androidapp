package com.ahamed.weatherforcasting.HomePage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Layout;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.ahamed.weatherforcasting.R;
import com.ahamed.weatherforcasting.RecyclerView.Data;
import com.ahamed.weatherforcasting.RecyclerView.ItemClickListener;
import com.ahamed.weatherforcasting.RecyclerView.RecyclerViewAdapter;

import java.util.ArrayList;

public class Today extends Fragment {

    RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_today, container, false);

        recyclerView=view.findViewById(R.id.recyclerView);
        ArrayList<Data> list=new ArrayList<>();
        list.add(new Data("Monday",R.drawable.ic_sun,"40",1));
        list.add(new Data("TuesDay",R.drawable.ic_music_light,"50",2));
        list.add(new Data("Wednesday",R.drawable.ic_thunder_cloud,"50",3));

        RecyclerViewAdapter adapter=new RecyclerViewAdapter(list,view.getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.HORIZONTAL,false));

        adapter.setItemClickListener(data -> {
            Toast.makeText(getContext(), "Done", Toast.LENGTH_SHORT).show();
            FragmentTransaction fragmentTransaction= getParentFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.today_container,new ContentViewer(),null);
            fragmentTransaction.setCustomAnimations(R.anim.slide_up,R.anim.slide_up);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        });
        return view;
    }

}
