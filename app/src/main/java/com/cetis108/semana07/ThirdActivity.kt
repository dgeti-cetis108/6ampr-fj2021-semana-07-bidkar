package com.cetis108.semana07

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class ThirdActivity : AppCompatActivity() {
    fun mostrarMensaje(mensaje: String) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage(mensaje)
            .setCancelable(false)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
        val alert = dialogBuilder.create()
        //alert.setMessage("Atención")
        alert.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        // agregar el regreso al activity que lo llamó
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // obtener el valor que llega del activity que lo llamó
        val saludo = intent.getStringExtra("saludo")

        val edad = intent.getIntExtra("edad", 0)
        mostrarMensaje("Tu edad es $edad")

        // cambiar el valor de la propiedad text del control tv_saludo
        val tv_saludo = findViewById<TextView>(R.id.tv_saludo)
        tv_saludo.text = saludo
    }
}