package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BetterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_better);

        // create an array of buttons
        int buttons[] = {R.id.btnA,R.id.btnB,R.id.btnC,R.id.btnD,R.id.btnE,R.id.btnF,R.id.btnG,R.id.btnH,R.id.btnI,R.id.btnJ,R.id.btnK,R.id.btnL,R.id.btnM,R.id.btnN,R.id.btnO,R.id.btnP,R.id.btnQ,R.id.btnR,R.id.btnS,R.id.btnT,R.id.btnU,R.id.btnV,R.id.btnW,R.id.btnX,R.id.btnY,R.id.btnZ};

        for (int i = 0; i < buttons.length; i++) {
            findViewById(buttons[i]).setOnClickListener(this::onClick);
        }
    }


    public void onClick(View view) {
        Button btn = (Button) view;
        String letter = btn.getText().toString();
        Intent intent = new Intent(getBaseContext(), LetterActivity.class);
        intent.putExtra("letter", letter);
        startActivity(intent);
    }
}