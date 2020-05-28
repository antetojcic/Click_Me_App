package com.example.clickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var intent = intent
        val count = intent.getStringExtra("counter") //zanemari
        val clickcount : TextView = findViewById(R.id.click_count)
        clickcount.setText("$broj. Click")
    }
}
