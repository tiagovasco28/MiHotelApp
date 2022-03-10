package com.mihotel

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Reservas : AppCompatActivity() {

    lateinit var texto_titulo: TextView
    lateinit var texto_precio: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservas)

        texto_titulo = findViewById(R.id.print_title)
        texto_precio = findViewById(R.id.print_precio)
        val id = intent.getStringExtra("titulo")
        val precio = intent.getStringExtra("precio")

        texto_titulo.setText(id);
        texto_precio.setText(precio)




    }
}