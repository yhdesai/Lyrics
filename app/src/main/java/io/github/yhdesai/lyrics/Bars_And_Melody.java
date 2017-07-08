package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;






public class Bars_And_Melody extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bars__and__melody);

        String [] bamSongs = new String[5];

        bamSongs[0] ="7 years";
        bamSongs[1] = "Battle Scars";
        bamSongs[2] = "Beautiful";
        bamSongs[3] = "Closer";
        bamSongs[4] = "Dont let me down";


        Log.e("Bars_And_Melody","Word at index 0: " + bamSongs[0]);
    }


    public void keepsmiling (View view) {
        Intent intent = new Intent(Bars_And_Melody.this, song_lyric_activity.class);
        startActivity(intent);}
}
