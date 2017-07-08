package io.github.yhdesai.lyrics;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

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


        ArrayAdapter<String> itemAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tsSongs);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);


    }


}
