package com.example.alphabetproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    public ListView lv;
    ArrayList<String> btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        btns = new ArrayList<String>();
        String str_alpha = null;

        for (int i = 65; i <= 97; i++) {
            str_alpha = Character.toString((char) i);
            btns.add(str_alpha);
        }

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, btns);

        lv = findViewById(R.id.listView);
        lv.setAdapter(adapter);
    }
}