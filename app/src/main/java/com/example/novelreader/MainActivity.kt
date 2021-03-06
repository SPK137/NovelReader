package com.example.novelreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debug","Main Activity Activated")

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        //val homeFragment = HomeFragment()
        val navbarFragment = NavbarFragment()
        //fragmentTransaction.add(R.id.fragment_main, homeFragment)
        fragmentTransaction.add(R.id.fragment_navbar, navbarFragment)
        fragmentTransaction.commit()

    }
}
