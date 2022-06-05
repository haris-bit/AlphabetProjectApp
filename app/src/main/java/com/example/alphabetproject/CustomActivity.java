package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);

        listView = findViewById(R.id.listView);

        List<Alphabet> lst = new ArrayList<Alphabet>();

        lst.add(new Alphabet(R.drawable.a1, "A"));
        lst.add(new Alphabet(R.drawable.b1, "B"));
        lst.add(new Alphabet(R.drawable.c1, "C"));
        lst.add(new Alphabet(R.drawable.d1, "D"));
        lst.add(new Alphabet(R.drawable.e1, "E"));
        lst.add(new Alphabet(R.drawable.f1, "F"));
        lst.add(new Alphabet(R.drawable.g1, "G"));
        lst.add(new Alphabet(R.drawable.h1, "H"));
        lst.add(new Alphabet(R.drawable.i1, "I"));
        lst.add(new Alphabet(R.drawable.j1, "J"));
        lst.add(new Alphabet(R.drawable.k1, "K"));
        lst.add(new Alphabet(R.drawable.l1, "L"));
        lst.add(new Alphabet(R.drawable.m1, "M"));
        lst.add(new Alphabet(R.drawable.n1, "N"));
        lst.add(new Alphabet(R.drawable.o1, "O"));
        lst.add(new Alphabet(R.drawable.p1, "P"));
        lst.add(new Alphabet(R.drawable.q1, "Q"));
        lst.add(new Alphabet(R.drawable.r1, "R"));
        lst.add(new Alphabet(R.drawable.s1, "S"));
        lst.add(new Alphabet(R.drawable.t1, "T"));
        lst.add(new Alphabet(R.drawable.u1, "U"));
        lst.add(new Alphabet(R.drawable.v1, "V"));
        lst.add(new Alphabet(R.drawable.w1, "W"));
        lst.add(new Alphabet(R.drawable.x1, "X"));
        lst.add(new Alphabet(R.drawable.y1, "Y"));
        lst.add(new Alphabet(R.drawable.z1, "Z"));


        AlphabetAdapter alphabetAdapter = new AlphabetAdapter(this, lst);

        listView.setAdapter(alphabetAdapter);

    }
}