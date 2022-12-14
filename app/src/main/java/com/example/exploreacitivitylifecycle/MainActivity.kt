package com.example.exploreacitivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("ActivityLifeCycle", "onCreate...")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActivityLifeCycle", "onPause...")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ActivityLifeCycle", "onStart...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ActivityLifeCycle", "onRestart...")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifeCycle", "onResume...")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActivityLifeCycle", "onStop...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityLifeCycle", "onCreate...")
    }

}