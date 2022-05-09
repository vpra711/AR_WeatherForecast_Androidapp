package com.ahamed.weatherforcasting.HomePage;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ahamed.weatherforcasting.MainActivity;
import com.ahamed.weatherforcasting.R;
import com.ahamed.weatherforcasting.RecyclerView.Data;
import com.ahamed.weatherforcasting.RecyclerView.RecyclerViewAdapter;


public class ContentViewer extends Fragment {

    private String day;
    private int image;
    private String degree;
    private int color;
    ContentViewer(Data data){
        this.color=data.getColor();
        this.image=data.getImage();
        this.degree=data.getDegree();
        this.day=data.getDay();
    }

    private ImageButton cancel;
    private RelativeLayout layout;
    private TextView dayText;
    private ImageView weatherImage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_content_viewer, container, false);

        layout=view.findViewById(R.id.content_container);
        cancel=view.findViewById(R.id.cancel);
        dayText=view.findViewById(R.id.content_text);
        TextView degreeText = view.findViewById(R.id.content_degree);
        weatherImage=view.findViewById(R.id.content_image);

        setBackground(color);
        weatherImage.setImageResource(image);
        dayText.setText(day);
        degreeText.setText(degree);

        cancel.setOnClickListener(v-> getParentFragmentManager().popBackStack());

        return view;
    }

    private void setBackground(int color){
        switch (color){
            case 1:
                layout.getBackground().setTint((Color.parseColor("#28e0ae")));
                break;
            case 2:
                layout.getBackground().setTint((Color.parseColor("#ff0090")));
                break;
            case 3:
            default:
                layout.getBackground().setTint((Color.parseColor("#ffae00")));
        }
    }
}