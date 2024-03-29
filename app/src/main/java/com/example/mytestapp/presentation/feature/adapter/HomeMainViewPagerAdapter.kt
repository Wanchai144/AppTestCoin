package com.example.mytestapp.presentation.feature.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytestapp.presentation.feature.detail.DetailFragment
import com.example.mytestapp.presentation.feature.home.HomeFragment
import com.example.mytestapp.presentation.feature.main.winget.BottomMenu
import com.example.mytestapp.presentation.feature.point.ScorePointFragment


class HomeMainViewPagerAdapter(
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle,
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            BottomMenu.BottomMenuHomePages.HOME.ordinal -> HomeFragment()
            BottomMenu.BottomMenuHomePages.DETAIL.ordinal -> DetailFragment()
            BottomMenu.BottomMenuHomePages.POINT.ordinal -> ScorePointFragment()
            else -> throw ExceptionInInitializerError()
        }
    }
}