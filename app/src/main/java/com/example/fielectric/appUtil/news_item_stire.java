package com.example.fielectric.appUtil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fielectric.R;

public class news_item_stire extends AppCompatActivity {

    public ImageView imagine;
    public TextView titlu_stire;
    public TextView text_stire;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_stire);

    }

    public void setImagine(ImageView imagine) {
        this.imagine = imagine;
    }

    public void setTitlu(String titluStire) {
        titlu_stire.setText(titluStire);
    }

    public void setText(String textStire) {
        text_stire.setText(textStire);
    }

}