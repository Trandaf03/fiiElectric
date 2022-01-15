package com.example.fielectric.appUtil;

public class object_presenting_item_data {

    private String title;
    private int imagine;
    private String text;


    public object_presenting_item_data(String title, String text, int imagine) {
        this.title = title;
        this.text = text;
        this.imagine = imagine;

    }


    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }


    public int getImagine() {
        return imagine;
    }


}
