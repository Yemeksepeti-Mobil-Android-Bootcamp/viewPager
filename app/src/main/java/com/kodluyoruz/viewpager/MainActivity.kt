package com.kodluyoruz.viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.kodluyoruz.viewpager.utils.ViewPagerAdapter
import com.kodluyoruz.viewpager.utils.ZoomOutPageTransformer

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initViewPager()
    }

    private fun initViews() {
        viewPager = findViewById(R.id.viewPager)
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(this)
        viewPager.setPageTransformer(ZoomOutPageTransformer())
        viewPager.adapter = adapter
    }
}