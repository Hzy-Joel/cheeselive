package com.hzy.CheeseLive

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.home_aty.*

class HomeAty : BaseActivity() {

    override fun getLayoutId(): Int = R.layout.home_aty

    override fun initView() {
        val navController = findNavController(R.id.home_nav)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.home_discover,
                R.id.home_im,
                R.id.home_user
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        homeNavView.setupWithNavController(navController)

    }

    class Build(private val context: Context) {
        fun build() {
            val intent = Intent(context, HomeAty::class.java)
            context.startActivity(intent)
        }
    }

}