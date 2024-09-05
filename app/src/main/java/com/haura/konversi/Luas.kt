package com.haura.konversi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Luas : AppCompatActivity() {

    private lateinit var etpanjang : EditText
    private lateinit var etlebar : EditText
    private lateinit var ettinggi : EditText
    private lateinit var btnLuasPermukaan : Button
    private lateinit var btnVolume : Button
    private lateinit var txtHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luas)

        etpanjang = findViewById(R.id.etpanjang)
        etlebar = findViewById(R.id.etlebar)
        ettinggi = findViewById(R.id.ettinggi)
        btnLuasPermukaan = findViewById(R.id.btnLuasPermukaan)
        btnVolume = findViewById(R.id.btnVolume)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnLuasPermukaan.setOnClickListener(){
            val panjang = etpanjang.text.toString().toInt()
            val lebar = etlebar.text.toString().toInt()
            val tinggi = ettinggi.text.toString().toInt()
            val hasil = 2 *(panjang * lebar + panjang * tinggi + lebar * tinggi)
            txtHasil.setText("Luas Permukaan Balok adalah : "+hasil)
        }

        btnVolume.setOnClickListener(){
            val panjang = etpanjang.text.toString().toInt()
            val lebar = etlebar.text.toString().toInt()
            val tinggi = ettinggi.text.toString().toInt()
            val hasil = panjang * lebar * tinggi
            txtHasil.setText("Volume Balok adalah : "+hasil)
        }
    }
}