package com.cetis108.semana07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // agregar el regreso al activity que lo llamó
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // obtener el valor que llega del activity que lo llamó
        val saludo = intent.getStringExtra("saludo")

        // TODO: obtener el valor de la variable edad y mostrar un mensaje mencionandola
        // TODO: utiliza AlertDialog para mostrar el mensaje

        // cambiar el valor de la propiedad text del control tv_saludo
        val tv_saludo = findViewById<TextView>(R.id.tv_saludo)
        tv_saludo.text = saludo
    }
}