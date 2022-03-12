package com.example.android.firstweekchallenge

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginAcitvity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {
            if (edtEmail.text.trim().toString().isNullOrEmpty()) {
                edtEmail.setError("enter email please!");
            }
            if (edtPassword.text.trim().toString().isNullOrEmpty()) {
                edtPassword.setError("enter password please!");
            }

            btnLogin.setOnClickListener(){
                val intent = Intent(this, LoginAcitvity::class.java)
                startActivity(intent)
            }
        }
    }
}
