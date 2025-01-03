package com.example.uts_aulianofika.model

import com.example.uts_aulianofika.R

data class ModelMakanan(
    val image: Int,
    val judul: String,
    val harga: String
)
object Mocklist{
    fun getModel(): List<ModelMakanan>{
        val item1 = ModelMakanan(
            R.drawable.makananlima, judul = "Seblak", harga = "RP.20.000/Porsi"
        )
        val item2 = ModelMakanan(
            R.drawable.makananempat, judul="Rendang ", harga = "RP.15.000/Porsi"
        )
        val item3 = ModelMakanan(
            R.drawable.img1, judul ="Pukis", harga = "RP.20.000/Porsi"
        )
        val item4 = ModelMakanan(
            R.drawable.img2, judul="Hidangan penutup",  harga = "RP.20.000/Porsi"
        )
        val item5 = ModelMakanan(
            R.drawable.makananlima, judul= "seblak cihuy", harga = "RP.20.000/Porsi"
        )
        val item6 = ModelMakanan(
            R.drawable.empat, judul="Kopi Susu", harga = "RP.10.000/Porsi"
        )
        val itemList:ArrayList<ModelMakanan> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList

    }
}

