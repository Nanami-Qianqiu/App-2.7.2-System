package com.example.app272;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    final static String Username = "Nanami_Chiaki", Password = "03140719";
    EditText us, ps;
    Button lg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        us = findViewById(R.id.username);
        ps = findViewById(R.id.password);
        lg = findViewById(R.id.button);
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        lg.setOnClickListener(v -> {
            String us_name = us.getText().toString();
            String ps_word = ps.getText().toString();
            if (us_name.equals(Username) && Password.equals(ps_word)) {
                Toast.makeText(this, "Login successful.", Toast.LENGTH_SHORT).show();
            } else {
                ps.setText("");
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
                startActivityForResult(i, 1);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case 1:
                us.setText(data.getStringExtra("us_name"));
        }
    }
}