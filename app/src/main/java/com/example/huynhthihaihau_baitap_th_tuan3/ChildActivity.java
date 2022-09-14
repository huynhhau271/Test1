package com.example.huynhthihaihau_baitap_th_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Button btnBack= (Button)
                findViewById(R.id.btnBacktoMainActivity);
        btnBack.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View v) {
                                                   finish();
                                               }
                                           });
    }
    }
