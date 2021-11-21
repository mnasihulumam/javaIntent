package com.example.modul6_m_nasihul_umam;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final TextView hasil = (TextView) findViewById(R.id.hasildata);
        String data = getIntent().getExtras().getString("data");
        hasil.setText(data);
        Toast.makeText(this, "YOUR BUTTON CLICK "+data, Toast.LENGTH_SHORT).show();
    }
}
