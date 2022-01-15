package com.example.fielectric.appUtil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fielectric.R;
import com.example.fielectric.motociclete.pagina_motociclete;

public class object_presenting_item extends AppCompatActivity {

    public ImageView imagine;
    public TextView titlu;
    public TextView text;

    @Override
    public void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_object);

    }

    public void setImagine(ImageView imagine) {
        this.imagine = imagine;
    }

    public void setTitlu(String titluObject) {
        titlu.setText(titluObject);
    }

    public void setText(String textObject) {
        text.setText(textObject);
    }

}
