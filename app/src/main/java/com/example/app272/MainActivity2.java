package com.example.app272;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button sgn;
    EditText us, ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sgn = findViewById(R.id.button2);
        us = findViewById(R.id.username2);
        ps = findViewById(R.id.password2);
        Intent i = new Intent();
        sgn.setOnClickListener(v -> {
            String us_name = us.getText().toString();
            i.putExtra("us_name", us_name);
            setResult(1, i);
            Toast.makeText(this, "Register successful.",Toast.LENGTH_SHORT).show();
            finish();
        });
    }
}