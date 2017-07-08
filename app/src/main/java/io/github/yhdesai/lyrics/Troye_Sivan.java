package io.github.yhdesai.lyrics;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class Troye_Sivan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_troye__sivan);

        ArrayList<String> tsSongs = new ArrayList<>();


        tsSongs.add("Youth");
        tsSongs.add("Wild");
        tsSongs.add("Fools");
        tsSongs.add("Blue Neighbourhood");
        tsSongs.add("There for you");



        LinearLayout bamSongsActivity = (LinearLayout) findViewById(R.id.tsSongsActivity);
        for (int index = 0; index < tsSongs.size(); index++)

        {
            Button bamSongButtons1 = new Button(this);
            bamSongButtons1.setText(tsSongs.get(index));
            bamSongsActivity.addView(bamSongButtons1);
        }


    }


}
