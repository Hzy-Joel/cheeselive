package com.hzy.CheeseLive

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity

/**
 * User: hzy
 * Date: 2020/7/25
 * Time: 3:09 PM
 * Description:
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutId())
        initView()
        initEvent()
    }

    open fun initEvent() {}
    open fun initView() {}
    abstract fun getLayoutId(): Int
}