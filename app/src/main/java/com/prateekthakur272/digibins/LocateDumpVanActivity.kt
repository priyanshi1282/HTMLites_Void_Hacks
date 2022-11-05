package com.prateekthakur272.digibins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LocateDumpVanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locate_dump_van)
        supportActionBar?.title = "Locate Dumping Vans"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}