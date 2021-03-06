package com.cetis108.semana07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_second = findViewById<Button>(R.id.btnSecond)
        btn_second.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val btn_third = findViewById<Button>(R.id.btnThird)
        btn_third.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("saludo", "Hola desde el MainActivity")

            val edad: Int = 41
            intent.putExtra("edad", edad)
            // intent.putExtra("edad", "Tu edad es $edad años")

            startActivity(intent)
        }
    }
}