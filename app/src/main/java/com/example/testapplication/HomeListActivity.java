package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class HomeListActivity extends AppCompatActivity {


    GridView grid;
    String[] web = {
            "Google",
            "Github",
            "Instagram",
            "Facebook",
            "Flickr",
            "Pinterest",
            "Quora",
            "Twitter",
            "Vimeo",
            "WordPress",
            "Youtube",
            "Stumbleupon",
            "SoundCloud",
            "Reddit",
            "Blogger"

    } ;
    int[] imageId = {
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google,
            R.drawable.google

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_list);

        Button newnote = findViewById(R.id.newnotebtn);

        customGrid adapter = new customGrid(this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, ViewDetails.class);
            i.putExtra("notename", web[+position]);
            startActivity(i);
        });

        newnote.setOnClickListener(v -> {

                Intent i = new Intent(this, ViewDetails.class);
                i.putExtra("notename", "Untitled");
                startActivity(i);

        });


    }

}