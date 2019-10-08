package com.example.frasedodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var texto : TextView;
    val frase = arrayOf(
        "Coisa 1 ",
        "Ebanx",
        "Vai ficar bem ")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto = findViewById<TextView>(R.id.textoFrase)
    }
    fun gerarFrase(view: View){
        val qntItens = frase.size
        val random = Random()
        var numeroAleatorio = random.nextInt( qntItens)
        texto.setText(frase[numeroAleatorio])
        print(frase[numeroAleatorio])
    }
}
