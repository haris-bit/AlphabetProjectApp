package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class HomeActivity extends AppCompatActivity {

    private Button btnRepo;
    private Button btnAlphaButtons;
    private Button btnAlphaList;
    private Button btnGame;
    private Button btnAlphaCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRepo = findViewById(R.id.btnRepo);
        btnAlphaButtons = findViewById(R.id.btnAlphaButtons);
        btnAlphaList = findViewById(R.id.btnAlphaList);
        btnGame = findViewById(R.id.btnGame);
        btnAlphaCustom = findViewById(R.id.btnAlphaCustom);

        btnRepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/haris-bit/AlphabetProjectApp"));
                startActivity(browserIntent);
            }
        });

        btnAlphaButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btnAlphaList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ListViewActivity.class);
                startActivity(intent);
            }
        });

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), PlayGameActivity.class);
                startActivity(intent);
            }
        });

        btnAlphaCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), CustomActivity.class);
                startActivity(intent);
            }
        });

    }
}