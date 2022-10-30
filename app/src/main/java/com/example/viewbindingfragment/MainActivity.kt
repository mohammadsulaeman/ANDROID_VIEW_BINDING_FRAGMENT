package com.example.viewbindingfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val home = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout_home,home).commitAllowingStateLoss()
    }
}