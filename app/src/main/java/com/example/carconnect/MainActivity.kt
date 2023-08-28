package com.example.carconnect

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    var mercedescard: CardView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mercedescard = findViewById<View>(R.id.mercedescard) as CardView
        mercedescard!!.setOnClickListener {
            val intent = Intent(this@MainActivity, mercedesrecyscleview::class.java)
            startActivity(intent)
        }
    }
}