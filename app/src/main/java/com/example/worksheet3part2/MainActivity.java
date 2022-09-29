package com.example.worksheet3part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button hellobutton;
    TextView tv;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("onCreate");
        hellobutton = findViewById(R.id.button);
        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);

        hellobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("hello world");
                et.setText("hello world");
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("onStart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("onRetart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        System.out.println("onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("onDestroy");
    }
}