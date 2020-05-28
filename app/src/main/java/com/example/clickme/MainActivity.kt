package com.example.clickme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

var broj = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnclickme : Button = findViewById(R.id.btn_click_me)
        broj = 0 //brojač (globalna varijabla)
        btnclickme.setOnClickListener {
            var count = 0 // pokušaj
            count++
            broj++
            if (broj<8){
                hidden_message.visibility=View.INVISIBLE
            val intent = Intent (this, SecondActivity::class.java)
            intent.putExtra("counter", count)   //zanemari ovo, pokušavao sam prebaciti varijablu
            startActivity(intent)}
            if (broj>8){
                hidden_message.visibility=View.VISIBLE

            }
        }
        val btntoast : Button = findViewById(R.id.btn_toast)
        btntoast.setOnClickListener {
            if (broj < 8) {
                Toast.makeText(applicationContext, R.string.toast_keep_clicking, Toast.LENGTH_SHORT).show()
            }
            if (broj > 8) {
                Toast.makeText(applicationContext, R.string.toast_tired, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
