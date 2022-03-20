package com.example.nhapxuat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ham_Xin_Chao(View v) {
        Toast.makeText(MainActivity.this, "Xin chào, tôi là Hoàng Quốc Nam", Toast.LENGTH_LONG).show();
    }
}