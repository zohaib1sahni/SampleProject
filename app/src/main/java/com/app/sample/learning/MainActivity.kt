package com.app.sample.learning

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainLogger:"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun branchAfterRevertMethod1() {
        Log.d(TAG, "branchAfterRevertMethod1: ")
    }
}