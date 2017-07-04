package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Artist_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist__list);
    }


    public void bam (View view) {
        Intent intent = new Intent(Artist_List.this, Bars_And_Melody.class);
        startActivity(intent);}


    public void ts (View view) {
        Intent intent = new Intent(Artist_List.this, Troye_Sivan.class);
        startActivity(intent);}


    public void jb (View view) {
        Intent intent = new Intent(Artist_List.this, Justin_Bieber.class);
        startActivity(intent);}







}
