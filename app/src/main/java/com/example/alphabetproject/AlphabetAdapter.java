package com.example.alphabetproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AlphabetAdapter extends ArrayAdapter<Alphabet> {
    public AlphabetAdapter(@NonNull Context context, @NonNull List<Alphabet> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // AlphabetAdapter is the context;
        Alphabet alphabet = this.getItem(position);
        // setting custom layout to convertview
        // converting xml to java
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.alphabetlayout, parent, false);
        ImageView iv = convertView.findViewById(R.id.imageView);
        TextView tvAlpha = convertView.findViewById(R.id.tvAlpha);

        iv.setImageResource(alphabet.getImageId());
        tvAlpha.setText(alphabet.getLetter());


        tvAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = (TextView) view;
                Toast.makeText(getContext(), textView.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;

    }
}
