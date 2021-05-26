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

    }
    fun options(list: MainActivity)
    {
        val url = Intent(this , Activity2::class.java)
        url.putExtra("url", "https://hub.dummyapis.com/ImagesList?text=Test&noofimages=10&height=120&width=120" )
        startActivity(url)
    }

    fun sendURL(view: View)
    {
        val url="https://hub.dummyapis.com/ImagesList?text=Test&noofimages=10&height=120&width=120"
        url.toString()
        val intent = Intent(this, Activity2::class.java)
        intent.putExtra(Activity2.URL_EXTRA, url)
        startActivity(intent)
    }
}