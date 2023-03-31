package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_sageshwar_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wsageshwar)

        val webView = findViewById<WebView>(R.id.sages)
        webView.loadUrl("file:///android_asset/Wildlife/Sagareshwar.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}