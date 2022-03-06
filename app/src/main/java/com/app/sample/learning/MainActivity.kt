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
    private fun branch2OwnMethod1() {
        Log.d(TAG, "branch2OwnMethod1: ")
    }

    private fun branch2OwnMethod2() {
        Log.d(TAG, "branch2OwnMethod2: ")
    }

    private fun masterNewBranch() {
        Log.d(TAG, "masterNewBranch: ")
    }

    private fun masterNewBranch2() {
        Log.d(TAG, "masterNewBranch2: ")
    }

    private fun branch2OwnMethod4() {
        Log.d(TAG, "branch2OwnMethod4: ")
    }

    private fun masterMethod39() {
        Log.d(TAG, "masterMethod39: ")
    }
}