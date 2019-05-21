package com.example.furi_thailand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Situation_accessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation_access);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");

        TextView situasitonTitle = findViewById(R.id.title);

        situasitonTitle.setText(title);

    }

    public void onBackButtonClick(View view) {
        finish();
    }
}
