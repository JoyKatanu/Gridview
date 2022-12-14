package com.example.gridview.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import com.example.gridview.R

class RatingBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating_bar)
        val rBar = findViewById<RatingBar>(R.id.rBar)
        if (rBar != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(this@RatingBarActivity,
                    "Rating is: "+msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}