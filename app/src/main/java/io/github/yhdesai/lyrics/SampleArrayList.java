package io.github.yhdesai.lyrics;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class SampleArrayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_array_list);

        ArrayList<String> artistSongs = new ArrayList<>();


        artistSongs.add("button1");
        artistSongs.add("button2");
        artistSongs.add("button3");
        artistSongs.add("button4");
        artistSongs.add("button5");



        LinearLayout bamSongsActivity = (LinearLayout) findViewById(R.id.artistSongsActivity);
        for (int index = 0; index < artistSongs.size(); index++)

        {
            Button artistSongButtons1 = new Button(this);
            artistSongButtons1.setText(artistSongs.get(index));
            bamSongsActivity.addView(artistSongButtons1);
        }


    }


}
