package com.example.zad1_oshnyakoff

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    public final var APP_PREFERENCES = "mysettings"
    public var PREFS_FILE = "Account"
    public var PREFS_NAME = "Name"
    lateinit var settings: SharedPreferences
    private lateinit var nameBox:EditText
    lateinit var nameView: TextView

    @Override
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE)
    }
    fun saveName(view:View){
        nameBox = findViewById(R.id.nameBox);
        var name = nameBox.getText().toString();
        var prefEditor = settings.edit();
        prefEditor.putString(PREFS_NAME,name);
        prefEditor.apply()
        var intent = Intent(this,screen2::class.java)
        intent.putExtra("log",name)

        var log = findViewById<EditText>(R.id.pasBox)
        var pas = findViewById<EditText>(R.id.nameBox)
        if(log.text.toString() != "" && pas.text.toString() != "")
        {
            startActivity(intent)
        }

    }

    fun n1(view: View) {


    }


}