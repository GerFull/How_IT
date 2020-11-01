package com.example.how_it;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    final MainActivity mainActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.button:
                        Intent intent = new Intent(mainActivity, MainActivity2.class);
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent1 = new Intent(mainActivity, MainActivity3.class);
                        startActivity(intent1);
                        break;
                }

            }

        };
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        //button3.setOnClickListener(onClickListener);
    }
}

    //Intent intent = new Intent(mainActivity, MainActivity2.class);
    //startActivity(intent);