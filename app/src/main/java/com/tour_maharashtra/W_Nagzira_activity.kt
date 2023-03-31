package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_Nagzira_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wnagzira)

        val webView = findViewById<WebView>(R.id.nagz)
        webView.loadUrl("file:///android_asset/Wildlife/Nagzira.html")

        webView.getSettings().setJavaScriptEnabled(true);

    }
}