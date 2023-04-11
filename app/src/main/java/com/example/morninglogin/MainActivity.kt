package com.example.morninglogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textlogin:TextView
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textlogin=findViewById(R.id.Txt_gotologin)

        textlogin.setOnClickListener {
            val intent=Intent(this,loginActivity::class.java)
            startActivity(intent)
        }

    }

}
