package com.hzy.CheeseLive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * User: hzy
 * Date: 2020/7/25
 * Time: 4:07 PM
 * Description:
 */
abstract class BaseFragment : Fragment() {
    protected var root :View?=null  
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        root =  inflater.inflate(getLayoutId(),container,false)
        initView()
        initEvent()
        return root
    }

    abstract fun getLayoutId():Int

    open fun initView() {}
    open fun initEvent() {}

}