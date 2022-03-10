package com.mihotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SearchRoom : AppCompatActivity() {

    lateinit var  btnReservar: Button;
    lateinit var  titulo: TextView;
    lateinit var  precio: TextView;
    lateinit var  text_titulo: String;
    lateinit var  text_precio: String;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_habitaciones)

        // find views
        btnReservar = findViewById(R.id.btn_reservar);
        titulo = findViewById(R.id.titulo_card);
        precio = findViewById(R.id.precio_card);

        //buttons

        btnReservar.setOnClickListener { reservas() }


    }


    fun reservas(){

            // abre nueva pantalla
            text_titulo = titulo.text.toString();
            text_precio = precio.text.toString();

            intent = Intent(this, Reservas::class.java)

            intent.putExtra("titulo",text_titulo);
            intent.putExtra("precio",text_precio);

            startActivity(intent)
        }

}