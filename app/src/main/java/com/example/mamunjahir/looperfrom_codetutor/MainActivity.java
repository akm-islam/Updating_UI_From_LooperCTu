package com.example.mamunjahir.looperfrom_codetutor;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    Button b2;
    TextView tv;
    boolean mstop;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        tv = findViewById(R.id.textView);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                mstop = true;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (mstop) {
                            Log.d("Value is :", "Thread is :" + Thread.currentThread().getId());
                            // tv.setText(counter);
                        }
                    }
                        }).start();

                    break;
            case R.id.button2:
                    mstop =false;
                Log.d("Value is :","Thread is :"+Thread.currentThread().

                    getId());
                break;

                }


        }
    }
