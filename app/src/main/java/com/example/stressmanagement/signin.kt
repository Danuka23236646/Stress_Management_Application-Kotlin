package com.example.stressmanagement

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin)

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val inent = Intent(this, register::class.java)
            startActivity(inent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val inent = Intent(this, home2::class.java)
            startActivity(inent)
        }
    }
}