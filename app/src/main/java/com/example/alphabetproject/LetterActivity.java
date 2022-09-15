package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LetterActivity extends AppCompatActivity {

    private TextView letterText;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);

        letterText = findViewById(R.id.letterText);
        imageView = findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();
        String letter_str = bundle.getString("letter");


        if (letter_str.equals("A")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.a4_update);
        } else if (letter_str.equals("B")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.b1);
        } else if (letter_str.equals("C")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.c2);
        } else if (letter_str.equals("D")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.d4_update);
        } else if (letter_str.equals("E")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.e2);
        } else if (letter_str.equals("F")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.f3);
        } else if (letter_str.equals("G")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.g2);
        } else if (letter_str.equals("H")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.h2_update);
        }  else if (letter_str.equals("I")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.i4);
        } else if (letter_str.equals("J")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.j1_update);
        } else if (letter_str.equals("K")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.k3_update);
        } else if (letter_str.equals("L")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.l4_update);
        }  else if (letter_str.equals("M")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.m3);
        }   else if (letter_str.equals("N")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.n5);
        } else if (letter_str.equals("O")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.o3_update);
        }  else if (letter_str.equals("P")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.p3);
        } else if (letter_str.equals("Q")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.q5_update);
        }  else if (letter_str.equals("R")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.r4);
        } else if (letter_str.equals("S")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.s4);
        }  else if (letter_str.equals("T")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.t4);
        } else if (letter_str.equals("U")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.u3_update);
        }  else if (letter_str.equals("V")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.v3);
        } else if (letter_str.equals("W")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.w2_update);
        } else if (letter_str.equals("X")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.x5_update);
        }  else if (letter_str.equals("Y")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.y3);
        } else if (letter_str.equals("Z")) {
            letterText.setText(letter_str);
            imageView.setImageResource(R.drawable.z4_update);
        }

    }
}