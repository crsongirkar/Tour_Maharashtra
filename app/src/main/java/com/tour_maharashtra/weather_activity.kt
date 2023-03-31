package com.tour_maharashtra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class weather_activity : AppCompatActivity() {
//    @SuppressLint("WrongViewCast", "MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val webView = findViewById<WebView>(R.id.btn_weather)
        webView.loadUrl("www.google.com")

        webView.getSettings().setJavaScriptEnabled(true);

    }
}