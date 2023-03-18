package com.example.sender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var senderIntent = Intent("com.example.sender.POST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            senderIntent.putExtra("message", findViewById<EditText>(R.id.editTextTextPersonName).text.toString())
            sendOrderedBroadcast(senderIntent, null)
        }
    }
}