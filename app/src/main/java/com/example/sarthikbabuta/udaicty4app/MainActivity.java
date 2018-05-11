package com.example.sarthikbabuta.udaicty4app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recent acitivity di id la lai
        TextView text1 = (TextView) findViewById(R.id.recent_activity);
        //jehri id te set on click listener lagata
        text1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //new activity kholi
                Intent intent = new Intent(MainActivity.this, recent.class);
                startActivity(intent);
            }
        });
        TextView text2 = (TextView) findViewById(R.id.available_activity);
        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, available.class);
                startActivity(intent);
            }
        });
        TextView text3 = (TextView) findViewById(R.id.playlist_activity);
        text3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, playlist.class);
                startActivity(intent);
            }
        });
        ImageView image1 = (ImageView) findViewById(R.id.information_activity);
        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, information.class);
                startActivity(intent);
            }
        });

        //pehla id la lai
        ImageView image2 = (ImageView) findViewById(R.id.star_music);
        image2.setOnClickListener(new View.OnClickListener() {

            //je no of click initialise 0 hai
            int no_of_clicks = 0;
            public void onClick(View view) {
                no_of_clicks++;

                //he 1 var dabya ta eh khule
                if (no_of_clicks % 2 == 0) {

                    ImageView p = (ImageView) findViewById(R.id.star_music);
                    //image eh set krde
                    p.setImageResource(R.drawable.ic_action_star);

                }
                else
                {
                    ImageView p = (ImageView) findViewById(R.id.star_music);
                    p.setImageResource(R.drawable.ic_action_stardark);
                }
            }
        });
        ImageView image3 = (ImageView) findViewById(R.id.play_music);
        image3.setOnClickListener(new View.OnClickListener() {
            int no_of_clicks = 0;
            public void onClick(View view) {
                no_of_clicks++;

                if (no_of_clicks % 2 == 0) {
                    ImageView p = (ImageView) findViewById(R.id.play_music);
                    p.setImageResource(R.drawable.ic_action_pause);

                }
                else
                {
                    ImageView p = (ImageView) findViewById(R.id.play_music);
                    p.setImageResource(R.drawable.ic_action_play);
                }
            }
        });

    }
}
