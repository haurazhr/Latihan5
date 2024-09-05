package com.haura.konversi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Suhu : AppCompatActivity() {

    private lateinit var etsuhu : EditText
    private lateinit var btnFahrenheit : Button
    private lateinit var btnKelvin : Button
    private lateinit var btnReamur : Button
    private lateinit var txtHasil : TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_suhu)

        etsuhu = findViewById(R.id.etsuhu)
        btnFahrenheit = findViewById(R.id.btnFahrenheit)
        btnKelvin = findViewById(R.id.btnKelvin)
        btnReamur = findViewById(R.id.btnReamur)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnFahrenheit.setOnClickListener(){
            val celsius = etsuhu.text.toString().toInt()
            val hasil = (9.0 / 5.0) * celsius + 32
            txtHasil.setText("Suhu Celsius dalam Fahrenheit : "+hasil)
        }

        btnKelvin.setOnClickListener(){
            val celsius = etsuhu.text.toString().toInt()
            val hasil = celsius + 273.15
            txtHasil.setText("Suhu Celsius dalam Kelvin : "+hasil)
        }

        btnReamur.setOnClickListener(){
            val celsius = etsuhu.text.toString().toInt()
            val hasil = (4.0 / 5.0) * celsius
            txtHasil.setText("Suhu Celsius dalam Reamur : "+hasil)
        }
    }
}