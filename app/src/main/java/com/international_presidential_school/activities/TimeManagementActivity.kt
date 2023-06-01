package com.international_presidential_school.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.international_presidential_school.R
import com.international_presidential_school.fragments.adapter.TimeManagementAdapter
import com.international_presidential_school.fragments.localMoreData.DailyFragment
import com.international_presidential_school.fragments.localMoreData.TasksFragment

class TimeManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_management)
        initView()

    }

    private fun initView() {
        val tabLayout = findViewById<TabLayout>(R.id.timeTbLayout_id)
        val viewPager = findViewById<ViewPager>(R.id.timeViewPager_id)
        val adapter = TimeManagementAdapter(supportFragmentManager)
        adapter.addFragment(DailyFragment(), "Daily plan")
        adapter.addFragment(TasksFragment(), "Schedule")

        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
    }
}