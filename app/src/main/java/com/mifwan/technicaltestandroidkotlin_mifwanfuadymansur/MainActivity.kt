package com.mifwan.technicaltestandroidkotlin_mifwanfuadymansur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonsignup);
        button.setOnClickListener {
            val intent = Intent(this, SignUp::class.java);
            startActivity(intent);
        }
    }
}
