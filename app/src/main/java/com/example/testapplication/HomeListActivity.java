package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeListActivity<a> extends AppCompatActivity {


    String[] titlelist;
    String[] deslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_list);

        Button newnote = findViewById(R.id.newnotebtn);

        final GridView grid = (GridView) findViewById(R.id.grid);

        if(MainActivity.notelist != null) {
           // System.out.println(MainActivity.notelist.toString());
            customGrid adapter = new customGrid(MainActivity.notelist);
            grid.setAdapter(adapter);

        }
      /*  Iterator<Note> iterator = notelist.iterator();
        int index = 0;
        while (iterator.hasNext()){
              titlelist[index] = iterator.next().getTitle().toString();
              deslist[index] = iterator.next().getDes().toString();
              index++;

            }
        }*/

        grid.setOnItemClickListener((parent, view, position, id) -> {
            Intent i = new Intent(this, ViewDetails.class);
            i.putExtra("pos", position);
            Toast.makeText(this,"You clicked on " + MainActivity.notelist.get(position).getTitle(),Toast.LENGTH_SHORT).show();

            startActivity(i);
        });

        newnote.setOnClickListener(v -> {

            Note ob = new Note("Untitled", "This is your new note.");

            MainActivity.notelist.add(ob);
            Intent intent = new Intent(this, HomeListActivity.class);
          //  intent.putExtra("pos",  MainActivity.notelist.indexOf(ob));
            startActivity(intent);

        });


    }

}