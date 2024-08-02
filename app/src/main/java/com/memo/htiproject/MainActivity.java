package com.memo.htiproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button androidButton = findViewById(R.id.androidbutton);
        androidButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,AndroidActivity.class);
            startActivity(intent);
        });
        Button iosButton = findViewById(R.id.iosbutton);
        iosButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,IosActivity.class);
            startActivity(intent);
        });
        Button fullStackButton = findViewById(R.id.fullbutton);
        fullStackButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,FullStackActivity.class);
            startActivity(intent);
        });
        }
    }