package com.hzy.CheeseLive

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginAty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_aty)
    }

    class Build(private val context: Context) {
        fun build() {
            val intent = Intent(context, LoginAty::class.java)
            context.startActivity(intent)
        }
    }
}