package com.tour_maharashtra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.ImageView

class W_bhimashankar_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wbhimashankar)



        val webView = findViewById<WebView>(R.id.Bhima)
        webView.loadUrl("file:///android_asset/Wildlife/Bhimashankar.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}