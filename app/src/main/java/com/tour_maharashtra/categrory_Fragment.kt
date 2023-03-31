package com.tour_maharashtra

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class categrory_Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_categrory)

    }

    // btnWildlife
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

// pass activity
        val c = inflater.inflate(R.layout.fragment_categrory, container, false)

        val btn = c.findViewById<AppCompatButton>(R.id.btnWildlife)

        btn.setOnClickListener {
            //val fragmentWildlife = Fragment_Wildlife
            activity?.let {
                val intent = Intent(it, wildlife_activity::class.java)
                it.startActivity(intent)
            }
        }
        val btn1 = c.findViewById<AppCompatButton>(R.id.btnWaterFall)
        btn1.setOnClickListener {
            activity?.let {
                val intent = Intent(it,waterfall_activity::class.java)
                it.startActivity(intent)
            }
        }
        val btn2 = c.findViewById<AppCompatButton>(R.id.btnForts)
        btn2.setOnClickListener {
            activity?.let {
                val intent = Intent(it,Forts_activity::class.java)
                it.startActivity(intent)
            }
        }

        val btn3 = c.findViewById<AppCompatButton>(R.id.btnAdventure)
        btn3.setOnClickListener {
            activity?.let {
                val intent = Intent(it,Adventure_activity::class.java)
                it.startActivity(intent)
            }
        }

        val btn4 = c.findViewById<AppCompatButton>(R.id.btnCaves)
        btn4.setOnClickListener {
            activity?.let {
                val intent = Intent(it,caves_activity::class.java)
                it.startActivity(intent)
            }
        }

        val btn5 = c.findViewById<AppCompatButton>(R.id.btnHotWater)
        btn5.setOnClickListener {
            activity?.let {
                var intent = Intent(it,Hot_water_activity::class.java)
                startActivity(intent)
            }
        }
        val btn6 = c.findViewById<AppCompatButton>(R.id.bthBeach)
        btn6.setOnClickListener {
            activity?.let {
                var intent = Intent(it,Beach_activity::class.java)
                startActivity(intent)
            }
        }

        return c
    }


}