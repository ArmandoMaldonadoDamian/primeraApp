package com.unitec.primeraapp

class MiImc {
    //vamos a generar el metodo para calcular el IMC
    fun calcular(peso:float, altura:float):float{
       var imc=peso/(altura*altura)
        return imc
    }
}