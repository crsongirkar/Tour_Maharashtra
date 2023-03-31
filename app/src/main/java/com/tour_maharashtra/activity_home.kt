package com.tour_maharashtra

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentManager
import com.google.android.gms.auth.api.identity.BeginSignInRequest
import com.google.android.gms.auth.api.identity.Identity
import com.google.android.gms.auth.api.identity.SignInClient
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
//import kotlinx..synthetic.activity.home_home_screen.*
import com.tour_maharashtra.databinding.ActivityCategoriesBinding

class activity_home : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val sec = findViewById<Button>(R.id.button2)
        sec.setOnClickListener {
            val intent = Intent(this,activity_login::class.java)
            startActivity(intent)
        }

    }

}




