package com.research.sqldatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //reference
    Button Opt1, Opt2, Opt3, Opt4, Opt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //giving variables values
        Opt1 = findViewById(R.id.Opt1);
        Opt2 = findViewById(R.id.Opt2);
        Opt3 = findViewById(R.id.Opt3);
        Opt4 = findViewById(R.id.Opt4);
        Opt5 = findViewById(R.id.Opt5);

        //click listeners
        Opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question2.class);
                startActivity(intent);
            }

            //when goes to next question: update data base?
            // Add question and answer to data and base

        });

        Opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question2.class);
                startActivity(intent);

            }
        });

        Opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question2.class);
                startActivity(intent);

            }
        });

        Opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question2.class);
                startActivity(intent);

            }
        });

        Opt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Next question", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Question2.class);
                startActivity(intent);

            }
        });


    }
}






