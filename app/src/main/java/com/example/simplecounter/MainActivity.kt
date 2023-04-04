package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var counter =0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.AddButtonView)
        val textView=findViewById<TextView>(R.id.ValueView)

        button.setOnClickListener{
            counter+=1
            textView.text=counter.toString()
        }
    }
}