package com.example.miprimeraappandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getString(R.string.app_name)
        Log.w(javaClass.name, "Estoy en onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w(javaClass.name, "Estoy en onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.w(javaClass.name, "Estoy en onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w(javaClass.name, "Estoy en onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w(javaClass.name, "Estoy en onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w(javaClass.name, "Estoy en onDestroy")
    }
}