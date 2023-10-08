package com.password.hack.loejg.qwfg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import kotlin.random.Random


class MainGame: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_game)

        val random: Int = Random.nextInt(0, 10000000)
        val finNum = findViewById<TextView>(R.id.finally_num)
        val rText = random.toString()
        val edText = findViewById<EditText>(R.id.your_num)
        val checkText = findViewById<TextView>(R.id.check)
        val winText = findViewById<TextView>(R.id.win)



        val btnCheck = findViewById<Button>(R.id.btnCheck)
        btnCheck.setOnClickListener {
            if(edText.text.toString() == rText){
                checkText.setText(" ")
                winText.setText("You WIN!!!")
                finNum.setText(rText)
            }
            if(edText.text.toString().toInt() < rText.toInt()){
                checkText.setText("Your number is less")
            }
            if(edText.text.toString().toInt() > rText.toInt()){
                checkText.setText("Your number is greater")
            }
        }


        val btnBack = findViewById<Button>(R.id.backBtn)
        btnBack.setOnClickListener{
            onBackPressed()
        }


    }
}