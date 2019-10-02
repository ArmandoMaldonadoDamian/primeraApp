package com.unitec.primeraapp

import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_bienvenido.*
import kotlinx.android.synthetic.main.content_bienvenido.*

class BienvenidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            var sonido=MediaPlayer.create(applicationContext,R.raw.sad)
            //SE INICIA EL SONIDO
            sonido.start()
            var peso=txtPeso.text.toString().toFloat()
            var altura=txtAltura.text.toString().toFloat()
            var imc=MiImc()

            Snackbar.make(view, "Tu imc de tu peso es $peso es"+" ${imc.calcular(peso,altura)}y ya", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
