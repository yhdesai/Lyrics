package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class Bars_And_Melody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars__and__melody);

        ArrayList<String> bamSongs = new ArrayList<>();


        bamSongs.add("1");


        LinearLayout bamSongsActivity=(LinearLayout)findViewById(R.id.bamSongsActivity);

        int index = 0;

        Button bamSongButtons1 = new Button(this);
        bamSongButtons1.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons1);

        index = index + 1;

        Button bamSongButtons2 = new Button(this);
        bamSongButtons2.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons2);

        index = index + 1;

        Button bamSongButtons3 = new Button(this);
        bamSongButtons3.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons3);

        index = index + 1;

        Button bamSongButtons4 = new Button(this);
        bamSongButtons4.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons4);

        index = index + 1;

        Button bamSongButtons5 = new Button(this);
        bamSongButtons5.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons5);

        index = index + 1;

        Button bamSongButtons6 = new Button(this);
        bamSongButtons6.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons6);

        index = index + 1;

        Button bamSongButtons7 = new Button(this);
        bamSongButtons7.setText(bamSongs.get(index));
        bamSongsActivity.addView(bamSongButtons7);





























    }


    public void keepsmiling (View view) {
        Intent intent = new Intent(Bars_And_Melody.this, song_lyric_activity.class);
        startActivity(intent);}
}
