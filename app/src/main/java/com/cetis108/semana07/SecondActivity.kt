package com.cetis108.semana07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Erick & Ingrid
        supportActionBar!!.title = "Regresar"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}