package com.example.gridview.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.gridview.R
import com.example.gridview.adapters.ViewPagerAdapter

class HouseDetailsActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house_details)

        val btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this, DatePickerActivity::class.java)
            startActivity(intent)
        }

        viewPager = findViewById(R.id.idViewPager)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.key
        imageList = imageList + R.drawable.clock
        imageList = imageList + R.drawable.set
        imageList = imageList + R.drawable.tab

        viewPagerAdapter = ViewPagerAdapter(this, imageList)
        viewPager.adapter = viewPagerAdapter

        val readMoreText: TextView = findViewById(R.id.readMoreText)
        val bedsitterDescription:TextView = findViewById(R.id.Bedsitter_descripion)

        var isTextViewClicked:Boolean = false

        readMoreText.setOnClickListener {
            if(isTextViewClicked){
                bedsitterDescription.maxLines = 5
                readMoreText.text = "Read more"
                isTextViewClicked = false
            }else{
                bedsitterDescription.maxLines = Int.MAX_VALUE
                readMoreText.text = "Show less"
                isTextViewClicked = true
            }
        }
}}
