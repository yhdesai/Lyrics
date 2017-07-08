package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;




int [] bamSongs = new int[5];

bamSongs[0] = 1;
bamSongs[1] = 2;
bamSongs[2] = 3;
bamSongs[3] = 4;
bamSongs[4] = 5;

public class Bars_And_Melody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars__and__melody);
    }


    public void keepsmiling (View view) {
        Intent intent = new Intent(Bars_And_Melody.this, song_lyric_activity.class);
        startActivity(intent);}
}
