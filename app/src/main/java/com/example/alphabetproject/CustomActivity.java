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


        AlphabetAdapter alphabetAdapter = new AlphabetAdapter(this, lst);

        listView.setAdapter(alphabetAdapter);

    }
}