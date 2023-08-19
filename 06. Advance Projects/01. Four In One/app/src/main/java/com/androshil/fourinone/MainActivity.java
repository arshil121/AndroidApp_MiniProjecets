package com.androshil.fourinone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Module of Exit implementation starts
        ImageView myImageView = findViewById(R.id.my_image_view);
        myImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setView(R.layout.dialog_confirm_exit);

                final AlertDialog dialog = builder.create();
                dialog.show();

                Button btnCancel = dialog.findViewById(R.id.btn_cancel);
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                Button btnExit = dialog.findViewById(R.id.btn_exit);
                btnExit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
            }
        });
        //Module of Exit implementation ends

        //Module of Embed Vide Player implementation starts
        LinearLayout embedvideo = findViewById(R.id.embedvideo);
        embedvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, embedVideoPlayer.class);
                startActivity(intent);
            }
        });
        //Module of Embed Vide Player implementation ends

        //Module of drawing a line below hashtag text starts
        TextView myTextView = findViewById(R.id.my_text_view);
        myTextView.setPaintFlags(myTextView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //Module of drawing a line below hashtag text ends


        //Module of web to app conversion starts
        LinearLayout web2app = findViewById(R.id.web2app);
        web2app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Webtoapp.class);
                startActivity(intent);
            }
        });
        //Module of web to app conversion ends

        //Module of Video Playlist starts

        LinearLayout videoplaylist = findViewById(R.id.videoplaylist);
        videoplaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoPlayList.class);
                startActivity(intent);
            }
        });

    }
}