package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_karnala_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wkarnala)

        val webView = findViewById<WebView>(R.id.karnala)
        webView.loadUrl("file:///android_asset/Wildlife/Karnala.html")

        webView.getSettings().setJavaScriptEnabled(true);

    }
}