package com.example.activitynav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        val mensaje = intent.getStringExtra("MENSAJE")
        val mensaje_a = intent.getStringExtra("MENSAJE_A")

        val boton_regresar = findViewById<Button>(R.id.go_back_button)

        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show()
        Toast.makeText(this,mensaje_a,Toast.LENGTH_SHORT).show()

        boton_regresar.setOnClickListener {
            finish()
        }
    }
}