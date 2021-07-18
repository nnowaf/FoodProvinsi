package com.nanyo.foodprovinsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvMakanan: RecyclerView
    private var list: ArrayList<Makanan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "Beranda"

        rvMakanan = findViewById(R.id.rv_food)
        rvMakanan.setHasFixedSize(true)

        list.addAll(MakananData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.openprofil, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun showRecyclerList() {
        rvMakanan.layoutManager = LinearLayoutManager(this)
        val listMakananAdapter = listMakananAdapter(list)
        rvMakanan.adapter = listMakananAdapter

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectMode: Int) {
       when(selectMode){
            R.id.openProfile -> {
                val profileAbout = Intent(this@MainActivity, moveAbout::class.java)
                startActivity(profileAbout)
            }
       }
    }




}