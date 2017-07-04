package io.github.yhdesai.lyrics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button OpenAllActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenAllActivity(View view) {
        Intent intent = new Intent(MainActivity.this, All_Activity.class);
        startActivity(intent);
    }

    public void artist (View view) {
        Intent intent = new Intent(MainActivity.this, Artist_List.class);
        startActivity(intent);}





















}



