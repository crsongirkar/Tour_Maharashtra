package com.tour_maharashtra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_bustard_park_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wbustard_park)

        val webView = findViewById<WebView>(R.id.park)
        webView.loadUrl("file:///android_asset/Wildlife/IndianBustard.html")

        webView.getSettings().setJavaScriptEnabled(true);

    }
}