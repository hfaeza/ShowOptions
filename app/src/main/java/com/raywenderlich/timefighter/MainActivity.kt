package com.raywenderlich.timefighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    internal lateinit var showoptions: Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showOption = findViewById<Button>(R.id.showoptions)
        showOption.setOnClickListener{sendURL()}
    }

    private fun sendURL()
    {
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra("url", "https://hub.dummyapis.com/ImagesList?text=Test&noofimages=10&height=120&width=120")
        startActivity(intent)
    }
}