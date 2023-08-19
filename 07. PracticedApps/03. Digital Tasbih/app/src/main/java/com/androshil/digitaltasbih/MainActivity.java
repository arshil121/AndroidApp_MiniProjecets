package com.androshil.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textview);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnsub = findViewById(R.id.btnsub);
        Button btnRe = findViewById(R.id.btnRe);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;
                //textview.setText("" + number);
                textview.setText(String.valueOf(number));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number--;
                textview.setText(String.valueOf(number));
            }
        });

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = 0;
                textview.setText(String.valueOf(number));
            }
        });

    }
}