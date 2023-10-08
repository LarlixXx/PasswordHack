package com.password.hack.loejg.qwfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.start_game)
        btnStart.setOnClickListener{
            val toGameIntent = Intent(this, MainGame::class.java)
            startActivity(toGameIntent)
        }
    }
}