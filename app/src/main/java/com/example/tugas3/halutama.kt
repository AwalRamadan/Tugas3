package com.example.tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class halutama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halutama)

        findViewById<View>(R.id.Lihat1).setOnClickListener {
            val packageContext = Intent()
            val open = Intent(this, content::class.java)
            startActivity(open)
        }
    }
}