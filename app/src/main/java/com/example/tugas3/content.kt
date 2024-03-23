package com.example.tugas3

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        findViewById<View>(R.id.Instal).setOnClickListener {
            val url="https://play.google.com/store/apps/details?id=com.vectorunit.purple.googleplay&pcampaignid=web_share"
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(url)
            startActivity(intent)
        }
    }
}