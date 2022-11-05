package com.prateekthakur272.digibins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LocateSmartBinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_locate_smart_bin)
        supportActionBar?.title = "Locate Smart Bins"
    }
}