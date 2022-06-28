package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber
import timber.log.Timber.Forest.plant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_log = findViewById<Button>(R.id.button_log);
        val button_timber = findViewById<Button>(R.id.button_timber);
        val editText = findViewById<EditText>(R.id.EditText);

        button_log.setOnClickListener {
            val text = editText.text.toString();
            Log.i("From TextEdit", text)
        }

        plant(Timber.DebugTree())

        button_timber.setOnClickListener {
            val text = editText.text.toString();
            Timber.d(text);
        }


    }
}