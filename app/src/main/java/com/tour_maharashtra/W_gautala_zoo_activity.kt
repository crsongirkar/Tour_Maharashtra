package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_gautala_zoo_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wgautala_zoo)

        val webView = findViewById<WebView>(R.id.gautala)
        webView.loadUrl("file:///android_asset/Wildlife/Gautala.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}