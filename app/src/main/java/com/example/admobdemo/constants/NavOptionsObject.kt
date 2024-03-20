package com.example.admobdemo.constants

import androidx.navigation.NavOptions
import com.example.admobdemo.R

object NavOptionsObject {
    val slideInAndOutBuilder = NavOptions.Builder().setEnterAnim(R.anim.slide_in_from_right).setExitAnim(R.anim.slide_out_to_left).setPopEnterAnim(R.anim.slide_in_from_left).setPopExitAnim(R.anim.slide_out_to_right)
}