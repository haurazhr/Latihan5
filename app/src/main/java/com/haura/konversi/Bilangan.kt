package com.haura.konversi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bilangan : AppCompatActivity() {

    private lateinit var angka : EditText
    private lateinit var btnInput : Button
    private lateinit var txtgenap : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bilangan)

        angka = findViewById(R.id.angka)
        btnInput = findViewById(R.id.btnInput)
        txtgenap = findViewById(R.id.txtgenap)

        btnInput.setOnClickListener(){
            val angka = angka.text.toString().toInt()
            val run = if (angka % 2 == 0){
                "$angka adalah bilangan genap"
            } else {
                "$angka adalah bilangan ganjil"
            }
            txtgenap.text=run
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}