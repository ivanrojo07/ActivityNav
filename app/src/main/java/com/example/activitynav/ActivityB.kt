package com.example.activitynav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val boton_c = findViewById<Button>(R.id.boton_c)
        val boton_d = findViewById<Button>(R.id.boton_d)

        boton_c.setOnClickListener {
            var intent_c = Intent(this, ActivityC::class.java)
            startActivity(intent_c)
        }

        boton_d.setOnClickListener {
            var intent_d = Intent(this, ActivityD::class.java)
            startActivity(intent_d)
        }
    }
}