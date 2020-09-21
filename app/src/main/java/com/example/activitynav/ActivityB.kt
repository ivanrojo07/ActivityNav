package com.example.activitynav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val boton_c = findViewById<Button>(R.id.boton_c)
        val boton_d = findViewById<Button>(R.id.boton_d)
        val mensaje = intent.getStringExtra("MENSAJE")

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()

        boton_c.setOnClickListener {
            var intent_c = Intent(this, ActivityC::class.java)
            intent_c.putExtra("MENSAJE","Hacía actividad C")
            intent_c.putExtra("MENSAJE_A", mensaje)
            startActivity(intent_c)
        }

        boton_d.setOnClickListener {
            var intent_d = Intent(this, ActivityD::class.java)
            intent_d.putExtra("MENSAJE","Hacia actividad D")
            intent_d.putExtra("MENSAJE_A", mensaje)
            startActivity(intent_d)
        }
    }
}