package com.josielsantos.calculadoradenotas

import android.graphics.Color
import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_Calcular :Button = calcular
        val resultado  : TextView = resultado


        bt_Calcular.setOnClickListener {
            val nota1 :Int = Integer.parseInt(nota1.text.toString())
            val nota2 :Int = Integer.parseInt(nota2.text.toString())
            val nota3 :Int = Integer.parseInt(nota3.text.toString())
            val nota4 :Int = Integer.parseInt(nota4.text.toString())
            val media :Int = (nota1 + nota2 + nota3 + nota4)/4
            val faltas :Int = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10){
                resultado.setText("Aluno APROVADO!" + "\n" + "Nota Final:"+ media+"\n"+"Faltas "+ faltas)
                resultado.setTextColor(Color.GREEN)

            }
            else{
                resultado.setText("Aluno REPROVADO!" + "\n" + "Nota Final:"+ media+"\n"+"Faltas "+ faltas)
                resultado.setTextColor(Color.RED)
            }

        }
    }
}