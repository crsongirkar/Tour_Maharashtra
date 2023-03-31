package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_melghat_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wmelghat)

        val webView = findViewById<WebView>(R.id.elg)
        webView.loadUrl("file:///android_asset/Wildlife/Melghat.html")

        webView.getSettings().setJavaScriptEnabled(true);

    }
}