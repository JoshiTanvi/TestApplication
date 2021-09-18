package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Note> notelist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Note ob = new Note("Default Note 1", "This is note 1");
        Note ob2 = new Note("Default Note 2", "this is note 2");
        notelist.add(ob);
        notelist.add(ob2);

        //creating variables for the layout elements
        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);
        Button loginbtn = findViewById(R.id.loginbtn);

        Button newuser = findViewById(R.id.newuser);

        //setting listener on the login button
        loginbtn.setOnClickListener(v -> {
            if(username.getText().toString().equals("tanvi") && password.getText().toString().equals("tanvi")){
                //correct
                Intent i = new Intent(this, HomeListActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity.this,"Welcome to your notes!",Toast.LENGTH_SHORT).show();
            }else{
                //incorrect

                Toast.makeText(MainActivity.this,"LOGIN FAILED! TRY AGAIN!",Toast.LENGTH_SHORT).show();

            }
        });

        newuser.setOnClickListener(view -> {
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        });
    }
}