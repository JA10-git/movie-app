package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.unam);
        et2=(EditText) findViewById(R.id.pass);
        b1=(Button) findViewById(R.id.log);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString().trim();
                String s2=et2.getText().toString().trim();

                if (s1.equals("theater") && s2.equals("12345")) {
                    Intent i = new Intent(getApplicationContext(), menuActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),"invalid credentials",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}