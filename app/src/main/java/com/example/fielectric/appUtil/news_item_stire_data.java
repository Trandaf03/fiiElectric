package com.example.fielectric.appUtil;

import android.graphics.drawable.Drawable;

public class news_item_stire_data {

    private String stire1_title;
    private String stire1_desc;
    private int imagine;


    public news_item_stire_data(String title, String desc, int imagine) {
        this.stire1_title = title;
        this.stire1_desc = desc;
        this.imagine = imagine;
    }


    public String getTitle() {
        return stire1_title;
    }

    public String getDesc() {
        return stire1_desc;
    }

    public int getImagine() {
        return imagine;
    }

}
