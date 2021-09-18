package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button regibtn = findViewById(R.id.registerbtn);
        EditText name = findViewById(R.id.name);
        EditText mobile = findViewById(R.id.mobile);
        EditText email = findViewById(R.id.email);
        EditText pwd = findViewById(R.id.pwd);

        regibtn.setOnClickListener(view -> {
            if(name.getText().toString().isEmpty() || mobile.getText().toString().isEmpty() ||
                    email.getText().toString().isEmpty()|| pwd.getText().toString().isEmpty()){
                Toast.makeText(this,"All fields are required! Please fill the details",Toast.LENGTH_SHORT).show();


            }else if(!mobile.getText().toString().matches("\\d{10}")){
                Toast.makeText(this,"Please enter 10 digits indian mobile number.",Toast.LENGTH_SHORT).show();

            }else if(!email.getText().toString().matches("^(.+){4,25}@(.+){4,25}$")){
                Toast.makeText(this,"Please enter valid email.",Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(this,"Registration Successfully!",Toast.LENGTH_SHORT).show();

            }
        });
    }



}