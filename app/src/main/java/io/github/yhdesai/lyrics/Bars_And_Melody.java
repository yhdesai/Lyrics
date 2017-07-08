package io.github.yhdesai.lyrics;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class Bars_And_Melody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars__and__melody);

        ArrayList<String> bamSongs = new ArrayList<>();


        bamSongs.add("1");
        bamSongs.add("2");


        LinearLayout bamSongsActivity = (LinearLayout) findViewById(R.id.bamSongsActivity);
        for (int index = 0; index < bamSongs.size(); index++)

        {
            Button bamSongButtons1 = new Button(this);
            bamSongButtons1.setText(bamSongs.get(index));
            bamSongsActivity.addView(bamSongButtons1);
        }


    }


}
