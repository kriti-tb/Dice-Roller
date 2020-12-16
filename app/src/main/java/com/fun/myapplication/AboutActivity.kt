package com.`fun`.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val doneButton=findViewById<Button>(R.id.done_button)
        val nickname_display=findViewById<TextView>(R.id.nickname_text)
        val nickname= findViewById<EditText>(R.id.Nickname_edit)

        doneButton.setOnClickListener()
        {           nickname.setVisibility(GONE)
                    doneButton.setVisibility(GONE)
                    val txt: String =nickname.getText().toString()
                    nickname_display.setText("Hi "+txt)
                    nickname_display.setVisibility(VISIBLE)


        }

    }



}