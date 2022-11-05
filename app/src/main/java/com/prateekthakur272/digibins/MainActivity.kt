package com.prateekthakur272.digibins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val areaCleaningRequestButton:LinearLayout = findViewById(R.id.request_cleaning)
        val locateDumpingVanButton:LinearLayout = findViewById(R.id.locate_dump_van)
        val locateSmartBins:LinearLayout = findViewById(R.id.locate_smart_bins)

        areaCleaningRequestButton.setOnClickListener {
            startActivity(Intent(this,AreaCleaningRequestActivity::class.java))
        }
        locateSmartBins.setOnClickListener {
            startActivity(Intent(this,LocateSmartBinActivity::class.java))
        }
        locateDumpingVanButton.setOnClickListener {
            startActivity(Intent(this,LocateDumpVanActivity::class.java))
        }
    }
}