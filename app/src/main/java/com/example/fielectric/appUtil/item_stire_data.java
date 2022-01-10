package com.example.fielectric.appUtil;

public class item_stire_data {

    private String stire1_title;
    private String stire1_desc;


    public item_stire_data(String title, String desc){
        this.stire1_desc = title;
        this.stire1_title = desc;
    }
    public String getTitle(){
        return stire1_title;
    }
    public String getDesc(){
        return stire1_desc;
    }

}
