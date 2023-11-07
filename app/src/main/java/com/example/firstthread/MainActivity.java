package com.example.firstthread;

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

    public void ImageClicked(View view)
    {
        ImageView imageView = (ImageView)view;
        imageView.setX(view.getX() + 10);
    }
}