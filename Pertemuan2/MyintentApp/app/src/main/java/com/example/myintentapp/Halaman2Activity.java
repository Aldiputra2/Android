package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Halaman2Activity extends AppCompatActivity {
    public static final String EXTRA_DATA ="extra_data";
    TextView tvData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        tvData =findViewById(R.id.btnSit);
        String text =getIntent().getStringExtra(EXTRA_DATA);
        tvData.setText(text);
    }
}
