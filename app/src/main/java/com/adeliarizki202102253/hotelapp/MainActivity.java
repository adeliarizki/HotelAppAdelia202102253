package com.adeliarizki202102253.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://dailyhotels.id/wp-content/uploads/2022/07/Hotel-Tepi-Pantai.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}