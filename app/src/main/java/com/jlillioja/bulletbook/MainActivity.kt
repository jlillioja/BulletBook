package com.jlillioja.bulletbook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainTextView = findViewById<TextView>(R.id.mainTextView)
        mainTextView.text = "New text!"
    }
}
