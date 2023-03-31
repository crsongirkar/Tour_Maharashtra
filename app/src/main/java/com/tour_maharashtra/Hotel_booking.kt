package com.tour_maharashtra

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Hotel_booking : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_booking)

        val webView = findViewById<WebView>(R.id.txtHotelBooking)
        webView.loadUrl("file:///android_asset/Wildlife/Bhimashankar.html")

        webView.getSettings().setJavaScriptEnabled(true);
    }
}