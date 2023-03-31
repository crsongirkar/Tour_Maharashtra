package com.tour_maharashtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class W_konya_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wkonya)

        val webView = findViewById<WebView>(R.id.konya)
        webView.loadUrl("file:///android_asset/Wildlife/Koyna.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}