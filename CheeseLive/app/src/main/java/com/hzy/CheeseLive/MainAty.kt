package com.hzy.CheeseLive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_aty.*

class MainAty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_aty)
        login.setOnClickListener {
            HomeAty.Build(this).build()
        }
    }
}