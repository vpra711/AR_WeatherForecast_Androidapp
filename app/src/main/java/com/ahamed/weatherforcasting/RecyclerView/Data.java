package com.ahamed.weatherforcasting.RecyclerView;
public class Data {
    String day;
    int image;
    String degree;
    int color;

    public Data(String day, int image, String degree,int color) {
        this.day = day;
        this.image = image;
        this.degree = degree;
        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public String getDay() {
        return day;
    }
    public String getDegree() {
        return degree;
    }
    public int getImage() {
        return image;
    }
}
