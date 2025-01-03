package com.example.uts_aulianofika

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakanan : AppCompatActivity() {

    private lateinit var txtdetail : TextView
    private lateinit var imgdetail : ImageView
    private lateinit var txtharga: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

       txtdetail= findViewById(R.id.txtdetail)
        imgdetail =findViewById(R.id.imgdetail)
        txtharga = findViewById(R.id.hargadetail)

        //get data
        val detailText = intent.getStringExtra("judul")
        val detailimage= intent.getIntExtra("image",0)
        val detailharga = intent.getStringExtra("harga")

        txtdetail.setText(detailText)
        imgdetail.setImageResource(detailimage)
        txtharga.setText(detailharga)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}