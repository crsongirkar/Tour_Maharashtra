package com.tour_maharashtra

import android.app.Activity
import android.app.UiModeManager.MODE_NIGHT_YES
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tour_maharashtra.databinding.ActivityLoginBinding

class activity_login : AppCompatActivity() {

    lateinit var homeFragment: Home_Fragment
    lateinit var categroryFragment:categrory_Fragment
    lateinit var placeFragment: place_Fragment
    lateinit var profileFragment: Profile_Fragment
   // val wildlife = Fragment_Wildlife

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      //  binding = ActivityLoginBinding.inflate()
        setContentView(R.layout.activity_login)

        //
//        categroryFragment = categrory_Fragment()
//        val fm: FragmentManager = supportFragmentManager
//        fm.beginTransaction().replace(R.id.login, categroryFragment).commit()


        var bottomvav :BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_bar)
        var frame:FrameLayout =findViewById<FrameLayout>(R.id.frame_layout)

        homeFragment = Home_Fragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame_layout,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

          bottomvav.setOnNavigationItemSelectedListener { item->

              when(item.itemId)
           {
               R.id.nav_home->{
                   homeFragment = Home_Fragment()
                   supportFragmentManager
                       .beginTransaction()
                       .replace(R.id.frame_layout,homeFragment)
                       .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                       .commit()

           }
                  R.id.nav_category->{
                      categroryFragment=categrory_Fragment()
                      supportFragmentManager
                          .beginTransaction()
                          .replace(R.id.frame_layout,categroryFragment)
                          .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                          .commit()

                  }

                  R.id.nav_place->{
                      placeFragment=place_Fragment()
                      supportFragmentManager
                          .beginTransaction()
                          .replace(R.id.frame_layout,placeFragment)
                          .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                          .commit()

                  }
                  R.id.nav_prpfile->{
                      profileFragment=Profile_Fragment()
                      supportFragmentManager
                          .beginTransaction()
                          .replace(R.id.frame_layout,profileFragment)
                          .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                          .commit()
                  }
           }

              true

          }









// Dark mode code

//        {
////        val intent = Intent(activity, activity_categories::class.java)
////        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
////        activity.startActivity(intent)
//
////            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
////                setTheme(R.style.darkTheme)
////            } else {
////                setTheme(com.google.android.material.R.style.AlertDialog_AppCompat)
////            }
//
//
////        val sec = findViewById<Button>(R.id.button)
////         sec.setOnClickListener {
////             val intent = Intent(this,activity_home::class.java)
////                  startActivity(intent)
////         }
//
////         val switch:Switch = findViewById(R.id.Dark)
////
////        switch.setOnCheckedChangeListener { buttonView, isChecked ->
////
////            if(isChecked)
////            {
////            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
////            }
////            else{
////                 AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
////            }
////        }
//
////        val intent = Intent(activity, activity_categories::class.java)
////                intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
////                activity.startActivity(intent)
//
//        }
       
    }
}