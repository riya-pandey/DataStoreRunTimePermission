package com.riya.datastoreruntimepermission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    private lateinit var btnrun: Button
    private lateinit var btnsharep: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        btnrun = findViewById(R.id.btnrun)
        btnsharep = findViewById(R.id.btnsharep)

        btnsharep.setOnClickListener {
            startActivity(Intent(this, SharePreferences::class.java))
        }
    }

}