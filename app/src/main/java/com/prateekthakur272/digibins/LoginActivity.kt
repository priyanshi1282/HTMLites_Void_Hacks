package com.prateekthakur272.digibins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val loginButton:Button = findViewById(R.id.login_button)
        val mobileNumberInput:EditText = findViewById(R.id.phone_number_input)

        loginButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}