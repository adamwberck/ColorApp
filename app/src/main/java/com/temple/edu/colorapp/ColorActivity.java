package com.temple.edu.colorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Spinner colorSpinner = findViewById(R.id.spinner_color);
        colorSpinner.setAdapter(new ColorAdapter(this));

        colorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = view.findViewById(R.id.text_color);
                textView.setTextColor(Color.parseColor("black"));
                view.findViewById(R.id.layout_spin).setBackgroundColor(Color.parseColor(
                        "White"));

                String name = textView.getText().toString();
                ColorActivity.this.findViewById(R.id.layout_color).setBackgroundColor(
                        Color.parseColor(name));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
