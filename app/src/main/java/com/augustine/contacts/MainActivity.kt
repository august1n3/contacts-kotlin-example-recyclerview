package com.augustine.contacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val contactList = arrayOf(
            ContactDetails("ashraf","+255 677930673"),
            ContactDetails("leonard","+255 778720673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("nelson","+255 677930673"),
            ContactDetails("ashraf","+255 677930673"),
            ContactDetails("leonard","+255 778720673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("nelson","+255 677930673"),
            ContactDetails("ashraf","+255 677930673"),
            ContactDetails("leonard","+255 778720673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("nelson","+255 677930673"),
            ContactDetails("ashraf","+255 677930673"),
            ContactDetails("leonard","+255 778720673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("john","+255 677930673"),
            ContactDetails("nelson","+255 677930673"),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.contact_list)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = CustomAdapter(contactList)
    }
}