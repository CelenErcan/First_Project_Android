package com.example.section_2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtMesaj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMesaj = (TextView) findViewById(R.id.txtMesaj);
        txtMesaj.setText(R.string.karsilama_mesaj);
        txtMesaj.setTextSize(25);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Sistem Hazırlandı", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT).show();
        onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "on destroy", Toast.LENGTH_SHORT).show();
    }
}
