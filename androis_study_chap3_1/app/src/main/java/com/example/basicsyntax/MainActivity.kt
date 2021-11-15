package com.example.basicsyntax

import android.graphics.Insets.add
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fruits = mutableListOf("Apple","banana")
        val afterFruits = fruits.let{
            it.add("melon")
            it.count()
        }
        Log.d("결뢋값","$afterFruits")
    }
}