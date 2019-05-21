package com.example.furi_thailand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Situation_nightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation_night);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        TextView situasitonTitle = findViewById(R.id.title);

        situasitonTitle.setText(title);
    }
}
