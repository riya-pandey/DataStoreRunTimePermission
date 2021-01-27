package com.riya.datastoreruntimepermission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class SharePreferences : AppCompatActivity() {
    private lateinit var etUsername: TextInputEditText
    private lateinit var etPassword: TextInputEditText
    private lateinit var btnLogin: Button
    private lateinit var btnshare: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_preferences)

        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnshare = findViewById(R.id.btnshare)

        btnLogin.setOnClickListener {
            saveSharedPref()
        }
        btnshare.setOnClickListener {
            getSharedPref()
        }
    }
    private fun saveSharedPref(){
        val username = etUsername.text.toString()
        val password = etPassword.text.toString()

        val sharedprefences = getSharedPreferences("Login", MODE_PRIVATE)
        val editor = sharedprefences.edit()

        editor.putString("username", username)
        editor.putString("password", password)

        editor.apply()
        Toast.makeText(this,
        "Username and password is saved!!", Toast.LENGTH_SHORT).show()
    }

    private fun getSharedPref() {
        val sharedPref = getSharedPreferences("Login", MODE_PRIVATE)
        val username = sharedPref.getString("username", "")
        val password = sharedPref.getString("password", "")
        Toast.makeText(this, "Username : $username and password : $password", Toast.LENGTH_SHORT)
            .show()
    }
}