package com.example.modul6_m_nasihul_umam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setButton1(View v){
        final Button button1 = (Button) findViewById(R.id.button1);
        Intent i = new Intent(MainActivity.this, MainDetail.class);
        i.putExtra("data", button1.getText().toString());
        startActivity(i);
    }
    public void setButton2(View v){
        final Button button2 = (Button) findViewById(R.id.button2);
        Intent i = new Intent(MainActivity.this, MainDetail.class);
        i.putExtra("data", button2.getText().toString());
        startActivity(i);
    }
    public void setButton3(View v){
        final Button button3 = (Button) findViewById(R.id.button3);
        Intent i = new Intent(MainActivity.this, MainDetail.class);
        i.putExtra("data", button3.getText().toString());
        startActivity(i);
    }
}