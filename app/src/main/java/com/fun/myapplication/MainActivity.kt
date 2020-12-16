package com.`fun`.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn1)
        val aboutButton: Button = findViewById(R.id.about_btn)

        diceImage = findViewById(R.id.dice_image)

        rollButton.setOnClickListener { rollDice() }
        aboutButton.setOnClickListener()
        { about()}




    }

    private fun about()
    {         val intent = Intent(this, AboutActivity::class.java)
              startActivity(intent)
    }
    private fun rollDice()
    {       val resultText : TextView = findViewById(R.id.txt)
            val randomInt = (1..6).random()
            val drawableResource= when(randomInt)
            {   1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else-> R.drawable.dice_6
            }
        val result_text=when(randomInt)
        {   1-> "Hard Luck!"
            2-> "Double Attack!"
            3-> "Triple Trouble!"
            4-> "Four makes you roar!"
            5-> "Hurray! High Five!"
            else-> " Cherrio stunning six!"

        }

        diceImage.setImageResource(drawableResource)
        resultText.setText(result_text)
    }

}