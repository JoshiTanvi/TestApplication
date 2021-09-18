package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ViewDetails extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_details);

        TextView title = (TextView) findViewById(R.id.title);
        TextView des = (TextView) findViewById(R.id.description);
        Button savebtn = findViewById(R.id.savenotebtn);

        Intent i = getIntent();
        int index = 0;
        i.getIntExtra("pos", index);
        title.setText(MainActivity.notelist.get(index).getTitle());
        des.setText(MainActivity.notelist.get(index).getTitle());
        Toast.makeText(this,"You clicked on " + MainActivity.notelist.get(index).getTitle(),Toast.LENGTH_SHORT).show();

        savebtn.setOnClickListener(view -> {

            Note ob = new Note(title.getText().toString(), des.getText().toString());

            MainActivity.notelist.add(ob);
            Intent intent = new Intent(this, HomeListActivity.class);
            startActivity(intent);
        });

    }
}