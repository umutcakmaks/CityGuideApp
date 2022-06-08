package com.example.cityguideapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_cateogries.*

class AllCateogriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_cateogries)

        //Back to user dashborad
        back_pressed.setOnClickListener {
            var i = Intent(applicationContext, UserDashboardActivity::class.java)
            startActivity(i)
        }

        // example
        press_historicalPlaces.setOnClickListener {
            intentActionGo(1)
        }

        press_parks.setOnClickListener {
            intentActionGo(2)
        }

        press_hotels.setOnClickListener {
            intentActionGo(3)
        }

        press_library.setOnClickListener {
            intentActionGo(4)
        }

        press_parkings.setOnClickListener {
            intentActionGo(5)
        }

        press_prayerRoom.setOnClickListener {
            intentActionGo(6)
        }

        press_supermarket.setOnClickListener {
            intentActionGo(7)
        }

    }

    fun intentActionGo(categoryId: Int) {
        var intent = Intent(applicationContext, AllPlacesActivity::class.java)
        intent.putExtra("CALL_FROM_CATEGORY", "call_from_category")
        intent.putExtra("CATEOGRY_ID", categoryId)
        startActivity(intent)
    }
}