package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_radhanagari_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wradhanagari)

        val webView = findViewById<WebView>(R.id.randnag)
        webView.loadUrl("file:///android_asset/Wildlife/Radhanagari.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}