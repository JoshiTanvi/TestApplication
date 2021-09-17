package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViewDetails extends AppCompatActivity {

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
        setContentView(R.layout.activity_view_details);

        TextView title = (TextView) findViewById(R.id.title);
        TextView des = (TextView) findViewById(R.id.description);
        Button savebtn = findViewById(R.id.savenotebtn);

        Intent i = getIntent();
        String note = i.getStringExtra("notename");

        for (String t: web) {
            if(t.equals(note)){
                title.setText(note);
                des.setText(note);
                Toast.makeText(this,"You clicked on " + note,Toast.LENGTH_SHORT).show();

            }
        }



    }
}