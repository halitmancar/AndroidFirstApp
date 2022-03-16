package com.halitman.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeImage(View view){
        ImageView imageView = findViewById(R.id.imageView);
        if (imageView.getDrawable().getConstantState()==getResources().getDrawable(R.drawable.eraba).getConstantState()){
            imageView.setImageResource(R.drawable.untitled);
        } else
        imageView.setImageResource(R.drawable.eraba);
    }


}