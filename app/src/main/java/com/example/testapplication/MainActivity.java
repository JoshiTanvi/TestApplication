package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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