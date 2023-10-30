package com.example.mad_practical_10_21012021011

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ContactAdapter(context: Context, private val array: ArrayList<Contact>) : ArrayAdapter<Contact>(context, 0, array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listviewlayout, parent, false)

        val contact = getItem(position) // Access the Contact object from the adapter

        view.findViewById<TextView>(R.id.textView2).text = contact?.name
        view.findViewById<TextView>(R.id.textView3).text = contact?.phoneno
        view.findViewById<TextView>(R.id.textView4).text = contact?.address
        view.findViewById<TextView>(R.id.textView5).text = contact?.emailid



        val button1: FloatingActionButton = view.findViewById(R.id.floatinfBt)

        button1.setOnClickListener {
            // Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }

        return view
    }
}