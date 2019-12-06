package com.edgar.Tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtApellido
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtNombre
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtTelefono
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtCorreo
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtFecha
import kotlinx.android.synthetic.main.activity_segunda_actividad.txtEdad

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)

        val objetoIntent: Intent = intent

        var Nombre = objetoIntent.getStringExtra("Nombre")
        var Apellido = objetoIntent.getStringExtra("Apellido")
        var Telefono = objetoIntent.getStringExtra("Telefono")
        var Correo = objetoIntent.getStringExtra("Correo")
        var Fecha = objetoIntent.getStringExtra("Fecha")
        var Edad = objetoIntent.getStringExtra("Edad")

        txtNombre.text = Nombre
        txtApellido.text = Apellido
        txtTelefono.text = Telefono
        txtCorreo.text = Correo
        txtFecha.text = Fecha
        txtEdad.text = Edad





    }
}
