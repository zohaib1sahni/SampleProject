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

    private fun branch2OwnMethod3() {
        Log.d(TAG, "branch2OwnMethod3: ")
    }

    private fun branch2OwnMethod4() {
        Log.d(TAG, "branch2OwnMethod4: ")
    }

    private fun masterMethod39() {
        Log.d(TAG, "masterMethod39: ")
    }

    private fun branchMethod43() {
        Log.d(TAG, "branchMethod43: ")
    }





    private fun mainMethod47() {
        Log.d(TAG, "mainMethod47: ")
    }

    private fun branchMethod47() {
        Log.d(TAG, "branchMethod47: ")
    }

    private fun branch4FirstMethod() {
        Log.d(TAG, "branch4FirstMethod: ")
    }

    private fun branch4SecondMethod() {
        Log.d(TAG, "branch4SecondMethod: ")
    }

    private fun branch4ThirdMethod() {
        Log.d(TAG, "branch4ThirdMethod: ")
    }

    private fun branchMps3Method() {
        Log.d(TAG, "branchMps3Method: ")
    }

    private fun branchMps4Method() {
        Log.d(TAG, "branchMps4Method: ")
    }

    private fun branchMps5Method() {
        Log.d(TAG, "branchMps5Method: ")
    }
    private fun branchMps6Method() {
        Log.d(TAG, "branchMps6Method: ")
    }
}