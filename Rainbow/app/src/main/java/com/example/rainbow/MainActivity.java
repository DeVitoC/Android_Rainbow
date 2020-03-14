package com.example.rainbow;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button buttonRed;
    Button buttonBlue;
    Button buttonGreen;
    Button buttonOrange;
    Button buttonYellow;
    Button buttonPurple;
    LinearLayout layoutBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutBackground = findViewById(R.id.layout_background);

        buttonRed = findViewById(R.id.button_red);
        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Red", "Red button was clicked.");
                layoutBackground.setBackgroundColor(Color.RED);
            }
        });

        buttonBlue = findViewById(R.id.button_blue);
        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Blue", "Blue button was clicked");
                layoutBackground.setBackgroundColor(Color.BLUE);
            }
        });

        buttonGreen = findViewById(R.id.button_green);
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Green", "Green button was clicked");
                layoutBackground.setBackgroundColor(Color.GREEN);
            }
        });

        buttonOrange = findViewById(R.id.button_orange);
        buttonOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Orange", "Orange button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
            }
        });

        buttonYellow = findViewById(R.id.button_yellow);
        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Yellow", "Yellow button was clicked");
                layoutBackground.setBackgroundColor(Color.YELLOW);
            }
        });

        buttonPurple = findViewById(R.id.button_purple);
        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Purple", "Purple button was clicked");
                layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
            }
        });
    }
}
