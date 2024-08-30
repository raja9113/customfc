
package com.example.attendanceapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_register).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btn_clock_in).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ClockInActivity.class);
            startActivity(intent);
        });
    }
}
