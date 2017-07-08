package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class All_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_);
    }
    public void lbutton1 (View view) {
        Intent intent = new Intent(All_Activity.this, All_Activity.class);
        startActivity(intent);}

    public void lbutton2 (View view) {
        Intent intent = new Intent(All_Activity.this, Artist_List.class);
        startActivity(intent);}

    public void lbutton3 (View view) {
        Intent intent = new Intent(All_Activity.this, Bars_And_Melody.class);
        startActivity(intent);}

    public void lbutton4 (View view) {
        Intent intent = new Intent(All_Activity.this, Justin_Bieber.class);
        startActivity(intent);}

    public void lbutton5 (View view) {
        Intent intent = new Intent(All_Activity.this, MainActivity.class);
        startActivity(intent);}

    public void lbutton6 (View view) {
        Intent intent = new Intent(All_Activity.this, Troye_Sivan.class);
        startActivity(intent);}

    public void lbutton7 (View view) {
        Intent intent = new Intent(All_Activity.this, song_lyric_activity.class);
        startActivity(intent);}













}
