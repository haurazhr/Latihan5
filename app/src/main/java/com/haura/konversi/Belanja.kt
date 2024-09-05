package com.haura.konversi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class Belanja : AppCompatActivity() {

    private lateinit var etbelanja : EditText
    private lateinit var btnCalculate : Button
    private lateinit var txtHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_belanja)

        etbelanja = findViewById(R.id.etbelanja)
        btnCalculate = findViewById(R.id.btnCalculate)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnCalculate.setOnClickListener() {
            val TotalBelanja = etbelanja.text.toString().toDouble()
            val hargaAkhir = if (TotalBelanja < 100000){
                TotalBelanja
            } else if (TotalBelanja in 100000.0 .. 500000.0){
                TotalBelanja * 0.90
            } else if (TotalBelanja in 500000.0 .. 1000000.0){
                TotalBelanja * 0.80
            } else if (TotalBelanja > 1000000.0){
                TotalBelanja * 0.70
            } else {
                TotalBelanja
            }

            txtHasil.text = ("Total Bayar: Rp. ${"%.2f".format(hargaAkhir)}")
        }
        }

    }
