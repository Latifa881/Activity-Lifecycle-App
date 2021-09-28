package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById(R.id.textView)
    }

    override fun onStart() {
        super.onStart()
        textView.text="onStart"
        Log.d("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()
        textView.text="onResume"
        Log.d("MainActivity","onResume")
    }
    override fun onPause() {
        super.onPause()
        textView.text="onPause"
        Log.d("MainActivity","onPause")
    }
    override fun onStop() {
        super.onStop()
        textView.text="onStop"
        Log.d("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textView.text="onDestroy"
        Log.d("MainActivity","onDestroy")
    }


}