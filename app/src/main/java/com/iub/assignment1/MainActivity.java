package com.iub.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     private Button toastButton;
     private Button countButton;
     private TextView counterText;

    int counter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastButton = (Button) findViewById(R.id.button_toast);
        countButton = (Button) findViewById(R.id.button_count);
        counterText = (TextView) findViewById(R.id.text_counter);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello Toast!",Toast.LENGTH_SHORT).show();
                counterText.setText("0");
                counter = 0;
            }
        });

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                counterText.setText(Integer.toString(counter));
            }
        });
    }
}