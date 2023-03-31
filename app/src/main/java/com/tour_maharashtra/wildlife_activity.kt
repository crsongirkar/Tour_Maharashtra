package com.tour_maharashtra

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class wildlife_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wildlife)

        // bimashankar
        val sec = findViewById<Button>(R.id.btnBhimashankar)
        sec.setOnClickListener {
            val intent = Intent(this,W_bhimashankar_activity::class.java)
            startActivity(intent)
        }
        //park
        val sec1= findViewById<Button>(R.id.btnBustardPark)
        sec1.setOnClickListener {
            val intent = Intent(this,W_bustard_park_activity::class.java)
            startActivity(intent)
        }

        //3

        val sec2= findViewById<Button>(R.id.btnGautala_Zoo)
        sec2.setOnClickListener {
            val intent = Intent(this,W_gautala_zoo_activity::class.java)
            startActivity(intent)
        }
        val sec3= findViewById<Button>(R.id.btnKarnala)
        sec3.setOnClickListener {
            val intent = Intent(this,W_karnala_activity::class.java)
            startActivity(intent)
        }

        val sec4= findViewById<Button>(R.id.btnKonya)
        sec4.setOnClickListener {
            val intent = Intent(this,W_konya_activity::class.java)
            startActivity(intent)
        }

        val sec5 = findViewById<Button>(R.id.btnmelghat)
        sec5.setOnClickListener {
            val intent = Intent(this,W_melghat_activity::class.java)
            startActivity(intent)
        }

        val sec6= findViewById<Button>(R.id.btn_nagzira)
        sec6.setOnClickListener {
            val intent = Intent(this,W_Nagzira_activity::class.java)
            startActivity(intent)
        }
        val sec7= findViewById<Button>(R.id.btnPhansad)
        sec7.setOnClickListener {
            val intent = Intent(this,W_Phansad_activity::class.java)
            startActivity(intent)
        }

        val sec8= findViewById<Button>(R.id.btn_radh)
        sec8.setOnClickListener {
            val intent = Intent(this,W_radhanagari_activity::class.java)
            startActivity(intent)
        }
        val sec9= findViewById<Button>(R.id.btn_sag)
        sec9.setOnClickListener {
            val intent = Intent(this,W_bustard_park_activity::class.java)
            startActivity(intent)
        }
    }
}