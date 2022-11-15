package com.example.gridview.activities

import ViewerPageAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.gridview.R
import com.example.gridview.fragments.BedsitterFragment
import com.example.gridview.fragments.SingleFragment
import com.example.gridview.fragments.StudioFragment
import com.google.android.material.tabs.TabLayout

class HousesActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout  // creating object of TabLayout
    private lateinit var bar: Toolbar    // creating object of ToolBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_houses)

        pager = findViewById(R.id.viewPager)
        tab = findViewById(R.id.tabs)

        val adapter = ViewerPageAdapter(supportFragmentManager)

        adapter.addFragment(BedsitterFragment(), "Bedsitter")
        adapter.addFragment(SingleFragment(), "Single Room")
        adapter.addFragment(StudioFragment(), "Studio Apartment")

        pager.adapter = adapter

        tab.setupWithViewPager(pager)
    }
}