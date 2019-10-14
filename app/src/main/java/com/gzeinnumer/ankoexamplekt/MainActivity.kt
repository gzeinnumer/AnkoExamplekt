package com.gzeinnumer.ankoexamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            startActivity(intentFor<SecondActivity>("id" to 5).singleTop())
        }
        btn2.setOnClickListener {
            startActivity<SecondActivity>("id" to 5, "city" to "Padang")
        }
        btn3.setOnClickListener {
            makeCall("082385804045")
        }
        btn4.setOnClickListener {
            sendSMS("082385804045", "Hay Zein")
        }
        btn5.setOnClickListener {
            browse("https://github.com/gzeinnumer")
        }
        btn6.setOnClickListener {
            share("Bagikan zein","Ini bagikan")
        }
        btn7.setOnClickListener {
            email("m.fadli.zein.17@gmail.com","Zein","Pesan zein")
        }
    }
}
