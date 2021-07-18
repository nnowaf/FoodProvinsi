package com.nanyo.foodprovinsi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ActionMode

class moveAbout: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val judulProfile = supportActionBar
        judulProfile!!.title = "Profile"
        judulProfile.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}