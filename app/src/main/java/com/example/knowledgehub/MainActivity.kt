package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loginBtn: Button = findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            intent= Intent(applicationContext,Categories:: class.java)
            startActivity(intent)
        }
    }
}