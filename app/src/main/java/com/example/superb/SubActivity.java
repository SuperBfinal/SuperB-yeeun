package com.example.superb;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);
        Button mapbutton = findViewById(R.id.mapbutton);
        Button reviewbutton = findViewById(R.id.reviewbutton);
        Intent intent = getIntent();
    }

    public void onButton1Clicked(View view) {
        Intent urlintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.kr/maps/dir//%EB%8C%80%EC%A0%84%EA%B4%91%EC%97%AD%EC%8B%9C+%EC%9C%A0%EC%84%B1%EA%B5%AC+%EA%B6%81%EB%8F%99%EB%A1%9C18%EB%B2%88%EA%B8%B8+24+%EC%9A%A7%EA%B3%A8%EB%AC%B8%ED%99%94%EA%B3%B5%EC%9B%90/data=!3m1!1e3!4m16!1m6!3m5!1s0x35654b9865a02a03:0xf5f42f243550de03!2z7Jqn6rOo66y47ZmU6rO17JuQ!8m2!3d36.3625764!4d127.34854!4m8!1m0!1m5!1m1!1s0x35654b9865a02a03:0xf5f42f243550de03!2m2!1d127.34854!2d36.3625764!3e3?hl=ko"));
        startActivity(urlintent);
    }




}


