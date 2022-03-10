package com.mihotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    lateinit var usuarioInsertado:EditText
    lateinit var claveInsertada : EditText
    lateinit var botonConectar:Button
    lateinit var botonCerrar:Button
    var usuario = "admin"
    var password = "123"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        usuarioInsertado =  findViewById<EditText>(R.id.username)
        claveInsertada  = findViewById<EditText>(R.id.password)
        botonConectar = findViewById<Button>(R.id.button)
        botonCerrar = findViewById<Button>(R.id.cerrar)

        botonConectar.setOnClickListener {
          login()
        }

        botonCerrar.setOnClickListener {
            cerrarPantalla()
        }
    }


    fun cerrarPantalla(){
       finishAffinity()
    }


    fun login(){
        if(usuarioInsertado.text.toString() == usuario && claveInsertada.text.toString() == password){
            // abre nueva pantalla
            intent = Intent(this, Home::class.java)

            startActivity(intent)

        }else{
            Toast.makeText(this,"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show()
        }
    }



}