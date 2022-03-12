package com.example.android.firstweekchallenge

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        val edtFullName = findViewById<EditText>(R.id.edtFullName)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnSignup = findViewById<Button>(R.id.btnLogin)


        btnSignup.setOnClickListener {
            if (edtFullName.text.trim().toString().isNullOrEmpty()) {
                edtFullName.setError("Your full name");
            }
            if (edtEmail.text.trim().toString().isNullOrEmpty()) {
                edtEmail.setError("enter email please!");
            }
            if (edtPassword.text.trim().toString().isNullOrEmpty()) {
                edtPassword.setError("enter password please!");
            }

            val intent = Intent(this@SignupActivity, LoginAcitvity::class.java)
            startActivity(intent)
        }
    }
}
