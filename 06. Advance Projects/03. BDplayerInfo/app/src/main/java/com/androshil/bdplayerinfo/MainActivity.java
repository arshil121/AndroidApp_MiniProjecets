package com.androshil.bdplayerinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imgMash, imgShak, imgMush, imgAfif, imgLit, rhsbg;
    TextView playername, playertype, playerdes, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgMash = findViewById(R.id.imgMash);
        Picasso.get().load("https://img1.hscicdn.com/image/upload/f_auto,t_ds_square_w_320/lsci/db/PICTURES/CMS/316500/316529.png").into(imgMash);

        imgShak = findViewById(R.id.imgShak);
        Picasso.get().load("https://img1.hscicdn.com/image/upload/f_auto,t_ds_square_w_320/lsci/db/PICTURES/CMS/316500/316581.png").into(imgShak);

        imgMush = findViewById(R.id.imgMush);
        Picasso.get().load("https://img1.hscicdn.com/image/upload/f_auto,t_ds_square_w_320/lsci/db/PICTURES/CMS/316500/316578.png").into(imgMush);

        imgAfif = findViewById(R.id.imgAfif);
        Picasso.get().load("https://img1.hscicdn.com/image/upload/f_auto,t_ds_square_w_320/lsci/db/PICTURES/CMS/323100/323159.png").into(imgAfif);

        imgLit = findViewById(R.id.imgLit);
        Picasso.get().load("https://img1.hscicdn.com/image/upload/f_auto,t_ds_square_w_320/lsci/db/PICTURES/CMS/319700/319727.png").into(imgLit);

        rhsbg = findViewById(R.id.rhsbg);
        Picasso.get().load("https://cdn.dnaindia.com/sites/default/files/styles/full/public/2019/09/28/871626-twitter-8.jpg").into(rhsbg);

        playername = findViewById(R.id.playername);
        playertype = findViewById(R.id.playertype);
        playerdes = findViewById(R.id.playerdes);
        description = findViewById(R.id.description);


        imgMash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://imgnew.outlookindia.com/public/uploads/articles/2020/7/15/Webp.net-resizeimage_-_2020-07-15T105237_.172_.jpg").into(rhsbg);
                playername.setText("Mashrafe Bin Mortaza");
                playertype.setText("Bowler, Right hand Bat");
                //playerdes.setVisibility(View.INVISIBLE);
                description.setText("The quintessential country boy, Mashrafe Bin Mortaza epitomised the term \"bursting onto the scene\". He first came into attention during an under-17 regional tournament in 2001 when he bowled fast, slammed sixes and dived around without a care in the world.\n" +
                        "\n" +
                        "Mashrafe's entry also sparked plenty of enthusiasm because he was the first genuine fast bowler to emerge from Bangladesh since their entry into Test cricket in 2000. He was sent to a camp conducted by West Indian great Andy Roberts, who proclaimed that Mashrafe had a great future. The selectors fast-tracked his growth and within a few months, during which he played four games for Bangladesh A in India, the young man from far-off Narail took the new-ball against visiting Zimbabwe. Soon it was clear that he had what it takes: Mashrafe was making the likes of Grant Flower jump around due to his pace, a first for a Bangladeshi fast bowler.\n" +
                        "\n" +
                        "But another thing was also clear to those who observed him - his rickety bowling action. Feet and arms landed in the wrong arcs, and soon the injuries set in. And that has been the story of his career. Mashrafe has missed more games for Bangladesh than he has played ever since his 2001 debut. He has had seven operations on his legs, knees and ankles, which have taking a beating - first due to poor handling by captains who gave him long and ill-adviced bowling spells, and then due to freakish accidents.\n" +
                        "\n" +
                        "After many missed games in between the odd fiery spell, Mashrafe rose to prominence in 2004, when he helped Bangladesh beat India for the first time. He was ever-present when Bangladesh pushed Australia but dropped the crucial catch of Ricky Ponting that cost the home side a win. But he made up the following year when his four-wicket haul destroyed India in the 2007 World Cup game at Port-of-Spain. Mashrafe's early strikes have always helped Bangladesh, none more so than in the 2009 tri-series final when he and Nazmul Hossain sunk Sri Lanka to a new low - six runs for five wickets. Bangladesh lost the game but Mashrafe was tremendous in his ten overs.\n" +
                        "\n" +
                        "He was made captain in mid-2009 but in his first Test in charge, fell over and injured his knee. When he returned the next year, he led Bangladesh to a win against England in the summer of 2010 before falling over once again in his home debut as captain, against New Zealand. He missed the 2011 World Cup after yet another knee injury, but has since made a successful return in the 2012 Asia Cup.");
            }
        });


    }
}