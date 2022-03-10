package com.mihotel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.mihotel.R

class ModifyData : AppCompatActivity() {

    lateinit var editNombre: EditText
    lateinit var editApellido: EditText
    lateinit var editEmail: EditText
    lateinit var editPassword: EditText
    lateinit var editPhone: EditText
    lateinit var editFecha: EditText

    lateinit var btnModificar: Button
    lateinit var btnGuardar: Button
    lateinit var btnLogout: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modificar_datos)

        editNombre = findViewById<EditText>(R.id.nombre)
        editApellido = findViewById<EditText>(R.id.apellido)
        editEmail = findViewById<EditText>(R.id.email)
        editPassword = findViewById<EditText>(R.id.senha)
        editPhone = findViewById<EditText>(R.id.phone)
        editFecha = findViewById<EditText>(R.id.fecha)


        editNombre.isEnabled = false;
        editApellido.isEnabled = false;
        editEmail.isEnabled = false;
        editPassword.isEnabled = false;
        editPhone.isEnabled = false;
        editFecha.isEnabled = false;

        btnModificar = findViewById<Button>(R.id.modificar)
        btnGuardar = findViewById<Button>(R.id.guardar)
        btnLogout = findViewById<Button>(R.id.logoutPersonalData);

        btnModificar.setOnClickListener{
            modificarDatos()
        }

        btnGuardar.setOnClickListener {
            guardarDatos()
        }

        btnLogout.setOnClickListener {
            logout()
        }
    }



    fun modificarDatos(){
        editNombre.isEnabled = true;
        editApellido.isEnabled = true;
        editEmail.isEnabled = true;
        editPassword.isEnabled = true;
        editPhone.isEnabled = true;
        editFecha.isEnabled = true;
    }

    fun guardarDatos(){
        var textoNombre = editNombre.text
        var textoApellido = editApellido.text
        var textoEmail = editEmail.text
        var textoPassword = editPassword.text
        var textoPhone = editPhone.text
        var textoFecha = editFecha.text

        editNombre.setText(textoNombre)
        editApellido.setText(textoApellido)
        editEmail.setText(textoEmail)
        editPassword.setText(textoPassword)
        editPhone.setText(textoPhone)
        editFecha.setText(textoFecha)


        editNombre.isEnabled = false;
        editApellido.isEnabled = false;
        editEmail.isEnabled = false;
        editPassword.isEnabled = false;
        editPhone.isEnabled = false;
        editFecha.isEnabled = false;

    }

    fun logout(){
        intent = Intent(this, Home::class.java)

        startActivity(intent)
    }
}