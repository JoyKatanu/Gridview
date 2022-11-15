package com.example.gridview.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.gridview.R
import com.example.gridview.activities.HouseDetailsActivity


class SingleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_single, container, false)

        val bedSitter1: TextView = view.findViewById(R.id.bedSitter1)
        bedSitter1.setOnClickListener {
            val intent = Intent(context, HouseDetailsActivity::class.java)
            startActivity(intent)}
        return view
    }

}





