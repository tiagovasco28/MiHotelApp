package com.mihotel

import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import com.mihotel.R


class Home : AppCompatActivity() {

    lateinit var botonDesconectar: Button
    lateinit var buscarHabitacion: Button
    lateinit var btnDatosPersonales: Button
    lateinit var btnPopMenu: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        botonDesconectar = findViewById<Button>(R.id.button5)
        buscarHabitacion = findViewById<Button>(R.id.button2)
        btnDatosPersonales = findViewById<Button>(R.id.button3)
        btnPopMenu = findViewById<ImageButton>(R.id.showMenuButton)

        botonDesconectar.setOnClickListener {
            logout()
        }
        buscarHabitacion.setOnClickListener {
            buscarHabitaciones()
        }

        btnDatosPersonales.setOnClickListener {
            datosPersonales()
        }

        btnPopMenu.setOnClickListener {
        showPopup(btnPopMenu)
        }



    }

        fun showPopup(v : View){
            val popup = PopupMenu(this, v)
            val inflater: MenuInflater = popup.menuInflater
            inflater.inflate(R.menu.menu_main, popup.menu)
            popup.setOnMenuItemClickListener { menuItem ->
                when(menuItem.itemId){
                    R.id.item_menu_perfil ->{
                        datosPersonales()
                    }

                    R.id.item_menu_reservas-> {
                        buscarHabitaciones()
                    }
                    R.id.item_menu_historial-> {

                    }
                    R.id.item_menu_configuraciones-> {

                    }
                    R.id.item_menu_salir->{
                        cerrarPantalla()
                    }
                }
                true
            }
            popup.show()
        }



        fun logout() {
            intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        fun buscarHabitaciones() {
            intent = Intent(this, SearchRoom::class.java)
            startActivity(intent)
        }

        fun datosPersonales() {
            intent = Intent(this, ModifyData::class.java)
            startActivity(intent)
        }

        fun cerrarPantalla(){
            finishAffinity()
        }

    }

