package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.findViewById(R.id.LP).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent packageContext = new Intent();
                Intent open = new Intent(MainActivity.this, forgot_password.class);
                startActivity(open);
            }


        });

        this.findViewById(R.id.Daftar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent packageContext = new Intent();
                Intent open = new Intent(MainActivity.this, register.class);
                startActivity(open);
            }
        });

        this.findViewById(R.id.masuk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent packageContext = new Intent();
                Intent open = new Intent(MainActivity.this, halutama.class);
                startActivity(open);
            }
        });
    }
}