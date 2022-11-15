package com.example.gridview.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.gridview.adapters.GridRVAdapter
import com.example.gridview.R
import com.example.gridview.models.GridViewModal
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    val counties: Array<String> = arrayOf("Select your county","Nairobi","Kisumu","Nakuru")
    lateinit var courseGRV: GridView
    lateinit var courseList: List<GridViewModal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            val intent = Intent(this,HousesActivity::class.java)
            startActivity(intent)
        }

        val languages = resources.getStringArray(R.array.Counties)

        val spinner: Spinner = findViewById(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, counties)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    val itemSelected = counties[position]
                    if(itemSelected == "Select your county"){
                        return
                    }
                    Toast.makeText(this@MainActivity, counties[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {

                }
            }


        courseGRV = findViewById(R.id.idGRV)
        courseList = ArrayList<GridViewModal>()


        courseList = courseList + GridViewModal("Clock", R.drawable.clock)
        courseList = courseList + GridViewModal("collection", R.drawable.dsiy)
        courseList = courseList + GridViewModal("phone", R.drawable.gisv)
        courseList = courseList + GridViewModal("Python", R.drawable.jsat)
        courseList = courseList + GridViewModal("Javascript", R.drawable.keyo)
        courseList = courseList + GridViewModal("mobile", R.drawable.njes)
        courseList = courseList + GridViewModal("hand", R.drawable.port)
        courseList = courseList + GridViewModal("studio", R.drawable.tab)
        courseList = courseList + GridViewModal("Python", R.drawable.watu)


        val courseAdapter = GridRVAdapter(courseList = courseList, this@MainActivity)

        courseGRV.adapter = courseAdapter


        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                applicationContext, courseList[position].courseName + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }


}}}
