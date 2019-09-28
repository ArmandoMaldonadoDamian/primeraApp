package com.unitec.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //quitamos la action bar que aparece de defecto
        actionBar?.hide()

        //aqui vamos a poner el codigo de navegacion

        //manejamos el evento del boton buscandolo por su id
        ingresar.setOnClickListener { var i=Intent(this,BienvenidoActivity::class.java)
            startActivity(i)
        }


    }
}
