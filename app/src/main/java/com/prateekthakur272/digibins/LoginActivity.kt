package com.prateekthakur272.digibins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val loginButton:Button = findViewById(R.id.login_button)
        val mobileNumberInput:EditText = findViewById(R.id.phone_number_input)

        loginButton.setOnClickListener {
            if (mobileNumberInput.text.toString().isNotBlank() and  (mobileNumberInput.text.toString().length == 10)) {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }else{
                Toast.makeText(this,"Enter a valid mobile number",Toast.LENGTH_LONG).show()
            }
        }
    }
}