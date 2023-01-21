package com.example.countpeople

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<TextView>(R.id.text)
        val text2 = findViewById<TextView>(R.id.text2)
        val but1 = findViewById<Button>(R.id.button)
        var texttime = 0
        but1.setOnClickListener {

            texttime = texttime + 1
            text2.text = texttime.toString()
        }
    }
}