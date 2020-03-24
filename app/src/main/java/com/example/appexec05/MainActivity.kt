package com.example.appexec05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var imageDado: ImageView

    private fun jogarDado() {
        val randomInt = Random.nextInt(1,7)
        var imagemCarregar: Int = R.drawable.dice_6;
        if (randomInt == 1) {
            imagemCarregar = R.drawable.dice_1
        }
        if (randomInt == 2) {
            imagemCarregar = R.drawable.dice_2
        }
        if (randomInt == 3) {
            imagemCarregar = R.drawable.dice_3
        }
        if (randomInt == 4) {
            imagemCarregar = R.drawable.dice_4
        }
        if (randomInt == 5) {
            imagemCarregar = R.drawable.dice_5
        }
        Toast.makeText(
            this,
            "Número sorteado: ${randomInt} ",
            Toast.LENGTH_SHORT
        ).show()
        imageDado.setImageResource(imagemCarregar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.bt_jogar)
        btn.setOnClickListener {
            jogarDado()
        }
        imageDado = findViewById(R.id.iv_imageDados)
    }
}
