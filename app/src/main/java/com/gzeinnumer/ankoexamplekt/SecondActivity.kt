package com.gzeinnumer.ankoexamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val str = intent.getStringExtra("id")
        val str2 = intent.getStringExtra("city")
        Toast.makeText(applicationContext, str!!, Toast.LENGTH_SHORT).show()
    }
}
