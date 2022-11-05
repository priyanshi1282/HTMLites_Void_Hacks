package com.prateekthakur272.digibins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import com.google.android.material.snackbar.Snackbar

class AreaCleaningRequestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area_cleaning_request)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name:EditText = findViewById(R.id.person_name_input)
        val mobile:EditText = findViewById(R.id.phone_number_input)
        val location:Button = findViewById(R.id.location_button)
        val camera:ImageButton = findViewById(R.id.camera_button)
        val submit:Button = findViewById(R.id.submit_button)

        camera.setOnClickListener {
            startActivity(Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA))
        }
        submit.setOnClickListener {
            Snackbar.make(submit,"Request Submitted Successfully!",Snackbar.LENGTH_LONG).show()
            Handler().postDelayed({finish()},1000)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}