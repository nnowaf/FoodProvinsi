package com.nanyo.foodprovinsi

import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class moveDetail: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_food)
        val judulBar = supportActionBar
        judulBar!!.title = "Detail Makanan"
        judulBar.setDisplayHomeAsUpEnabled(true)


        val tvJenis: TextView = findViewById(R.id.tv_item_jenis)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvImg: ImageView = findViewById(R.id.img_item_photo)
        val tvKhas: TextView = findViewById(R.id.tv_item_khas)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)

        val name = intent.getStringExtra(EXTRA_NAME)
        val img = intent.getIntExtra(EXTRA_FOTO.toString(), 0)
        val khas = intent.getStringExtra(EXTRA_KHAS)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val jenis = intent.getStringExtra(EXTRA_JENIS)




        tvName.text = name
        Glide.with(this)
            .load(img)
            .into(tvImg)
        tvKhas.text = khas
        tvDetail.text = detail
        tvJenis.text = jenis


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_FOTO = 0
        const val EXTRA_KHAS = "extra_khas"
        const val EXTRA_JENIS = "extr_jenis"
    }
}
