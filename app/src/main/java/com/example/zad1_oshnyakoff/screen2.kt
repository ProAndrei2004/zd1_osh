package com.example.zad1_oshnyakoff

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class screen2 : AppCompatActivity() {
    lateinit var tex : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var tex1 = findViewById<TextView>(R.id.sectext)
        var l = getIntent().getStringExtra("log")
        //var p = getIntent().getStringExtra()
        tex1.text = l.toString()



    }
}