package com.androshil.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText kenaDam, profit;
    TextView result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kenaDam = findViewById(R.id.kenaDam);
        profit = findViewById(R.id.profit);
        result = findViewById(R.id.result);
        btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float buyingPrice, expectedProfit, sellingPrice;

                buyingPrice = Float.parseFloat(kenaDam.getText().toString());
                expectedProfit = Float.parseFloat(profit.getText().toString());
                sellingPrice = buyingPrice + ((expectedProfit / 100) * buyingPrice);

                result.setText(String.valueOf(sellingPrice));

            }
        });

    }
}