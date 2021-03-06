package com.example.cityguideapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.cityguideapp.adapter.OnBoardingViewPagerAdapter
import com.example.cityguideapp.model.OnBoardingData
import com.example.cityguideapp.script.ScriptDataActivity
import com.google.android.material.tabs.TabLayout


class OnBoardingActivity : AppCompatActivity() {

    var onBoardingViewPagerAdapter: OnBoardingViewPagerAdapter? = null
    var tabLayout: TabLayout? = null
    var onBoardingViewPager: ViewPager? = null
    var next: TextView? = null
    var position = 0
    var sharedPreference: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(restorePrefData()){
            val i = Intent(applicationContext, ScriptDataActivity::class.java)
            startActivity(i)
            finish()
        }

        setContentView(R.layout.activity_on_boarding)


        tabLayout = findViewById(R.id.tab_indicator)
        next = findViewById(R.id.textView)

        // add some data to model
        val onBoardingData:MutableList<OnBoardingData> = ArrayList()
        onBoardingData.add(OnBoardingData("Enjoy searching a new place", "find the best place in city", R.drawable.searching))
        onBoardingData.add(OnBoardingData("Enjoy historical place", "There are many awesome historical place around city", R.drawable.historical))
        onBoardingData.add(OnBoardingData("Find Place for Vlog", "If you the vlogger, this app is fantastic for you", R.drawable.park))

        setOnBoardingViewPagerAdapter(onBoardingData)

        position = onBoardingViewPager!!.currentItem

        next?.setOnClickListener {
            if(position < onBoardingData.size){
                position++
                onBoardingViewPager!!.currentItem = position
            }
            if(position == onBoardingData.size){
                savePrefData()
                val i = Intent(applicationContext, UserDashboardActivity::class.java)
                startActivity(i)
            }
        }

        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
               position = tab!!.position
                if(tab.position == onBoardingData.size -1){
                    next!!.text = "Get Started"
                                       
                } else {
                    next!!.text = "Next"
                }
            }
        })
    }

    private fun setOnBoardingViewPagerAdapter(onBoardingData: List<OnBoardingData>){
        onBoardingViewPager = findViewById(R.id.screenPager)
        onBoardingViewPagerAdapter = OnBoardingViewPagerAdapter(this, onBoardingData)
        onBoardingViewPager!!.adapter = onBoardingViewPagerAdapter
        tabLayout?.setupWithViewPager(onBoardingViewPager)
    }

    private fun savePrefData(){
        sharedPreference = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = sharedPreference!!.edit()
        editor.putBoolean("isFirstTimeRun", true)
        editor.apply()
    }

    private fun restorePrefData(): Boolean {
        sharedPreference = applicationContext.getSharedPreferences("pref", Context.MODE_PRIVATE)
        return sharedPreference!!.getBoolean("isFirstTimeRun", false)
    }
}