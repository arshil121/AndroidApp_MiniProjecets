package com.androshil.travelappui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView cover, searchbar;
    LinearLayout homebtn,me,homeTextllo;
    RelativeLayout mainrelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cover = findViewById(R.id.cover);
        Picasso.get().
                load("https://www.datocms-assets.com/32623/1653405910-dubai-1-large_vector.png?auto=format")
                .resize(410, 250)
                .into(cover);


        searchbar = findViewById(R.id.searchbar);
        Picasso.get().
                load("https://img.icons8.com/?size=512&id=12773&format=png")
                .into(searchbar);

        homebtn = findViewById(R.id.homebtn);
        mainrelative = findViewById(R.id.mainrelative);
        homeTextllo = findViewById(R.id.homeTextllo);
        me = findViewById(R.id.me);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainrelative.setVisibility(View.GONE);
                homeTextllo.setVisibility(View.VISIBLE);
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainrelative.setVisibility(View.VISIBLE);
                homeTextllo.setVisibility(View.GONE);
            }
        });

    }
}