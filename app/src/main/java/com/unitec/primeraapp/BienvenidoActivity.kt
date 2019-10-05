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


            var peso=txtPeso.text.toString().toFloat()
            var altura=txtAltura.text.toString().toFloat()
            var imc=MiImc()
            var valor=imc.calcular(peso,altura)
            //primero obtenemos el valor del imc
            if(valor>=20&&valor<=30){
                var sonido=MediaPlayer.create(applicationContext,R.raw.feliz)
                //SE INICIA EL SONIDO
                sonido.start()
            }else{
                var sonido=MediaPlayer.create(applicationContext,R.raw.sad)
                //SE INICIA EL SONIDO
                sonido.start()
            }

            Snackbar.make(view, "Tu imc es $valor", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
