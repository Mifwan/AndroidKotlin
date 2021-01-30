package com.mifwan.technicaltestandroidkotlin_mifwanfuadymansur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonback = findViewById<Button>(R.id.buttonback);
        buttonback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent);
        }
    }
}
