package com.edgar.Tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGo.setOnClickListener {

            var Nombre:String = txtNombre.text.toString()
            var Apellido:String = txtApellido.text.toString()
            var Telefono:String = txtTelefono.text.toString()
            var Correo:String = txtCorreo.text.toString()
            var Fecha:String = txtFecha.text.toString()
            var Edad:String = txtEdad.text.toString()

            val intent:Intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("Nombre", Nombre)
            intent.putExtra("Apellido", Apellido)
            intent.putExtra("Telefono", Telefono)
            intent.putExtra("Correo", Correo)
            intent.putExtra("Fecha", Fecha)
            intent.putExtra("Edad", Edad)

            startActivity(intent)
            finish()

        }


    }
}
