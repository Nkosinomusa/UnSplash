package com.example.unsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var buttonFrench: Button
    private lateinit var buttonSpanish: Button
    private lateinit var buttonChinese: Button
    private lateinit var buttonEnglish: Button
    private lateinit var buttonItalian: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_home)

        textView = findViewById(R.id.textView)
        buttonFrench = findViewById(R.id.buttonFrench)
        buttonSpanish = findViewById(R.id.buttonSpanish)
        buttonChinese = findViewById(R.id.buttonChinese)
        buttonEnglish = findViewById(R.id.buttonEnglish)
        buttonItalian = findViewById(R.id.buttonItalian)

        buttonFrench.setOnClickListener {
            textView.text = "Bonjour"
        }

        buttonSpanish.setOnClickListener {
            textView.text = "Hola"
        }

        buttonChinese.setOnClickListener {
            textView.text = "你好"
        }

        buttonEnglish.setOnClickListener {
            textView.text = "Hello"
        }

        buttonItalian.setOnClickListener {
            textView.text = "Ciao"
        }
    }
}
