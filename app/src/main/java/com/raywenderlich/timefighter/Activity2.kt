package com.raywenderlich.timefighter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.net.URL

class Activity2 : AppCompatActivity()
{
    companion object{
        const val URL_EXTRA = "url_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val url = intent.getStringExtra(URL_EXTRA)
        val queue = Volley.newRequestQueue(this)

        // Request a string response from the provided URL.
        val jsonArrayRequest = JsonArrayRequest(
            Request.Method.GET, url, null,
            { response ->
                val urls = List(response.length()) {
                    response.getString(it)
                }
                val imagesList = findViewById<ListView>(R.id.imagelist)
                val listAdapt = ArrayAdapter(this, android.R.layout.simple_list_item_1, urls)
                imagesList.adapter = listAdapt
            },
            {})
        queue.add(jsonArrayRequest)
    }

}