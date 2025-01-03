package com.example.uts_aulianofika

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_aulianofika.adapter.MakananAdapter
import com.example.uts_aulianofika.model.Mocklist
import com.example.uts_aulianofika.model.ModelMakanan

class RecycleMakan : AppCompatActivity() {

    private  lateinit var  rv_mkn : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_makan)

        rv_mkn = findViewById(R.id.Rv_mkn)

        rv_mkn.layoutManager = GridLayoutManager(this, 1,
            GridLayoutManager.VERTICAL,false)

        val  adapter = MakananAdapter(Mocklist.getModel() as ArrayList<ModelMakanan>, this)
        rv_mkn.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}