package com.haura.konversi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnSuhu: Button
    private lateinit var btnBelanja: Button
    private lateinit var btnLuas: Button
    private lateinit var btnBilangan: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnSuhu = findViewById(R.id.btnSuhu)
        btnBelanja = findViewById(R.id.btnBelanja)
        btnLuas = findViewById(R.id.btnLuas)
        btnBilangan = findViewById(R.id.btnBilangan)

        btnSuhu.setOnClickListener() {
            var intent = Intent(this@MainActivity, Suhu::class.java)
            startActivity(intent)

            btnBelanja.setOnClickListener() {
                var intent = Intent(this@MainActivity, Belanja::class.java)
                startActivity(intent)
            }

            btnLuas.setOnClickListener() {
                var intent = Intent(this@MainActivity, Luas::class.java)
                startActivity(intent)
            }

            btnBilangan.setOnClickListener() {
                var intent = Intent(this@MainActivity, Bilangan::class.java)
                startActivity(intent)
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets

            }


        }
    }
}