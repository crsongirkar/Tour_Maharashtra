package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_Phansad_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wphansad)

        val webView = findViewById<WebView>(R.id.phan)
        webView.loadUrl("file:///android_asset/Wildlife/Phansad.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}