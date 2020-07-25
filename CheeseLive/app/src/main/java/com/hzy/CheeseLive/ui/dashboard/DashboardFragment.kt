package com.hzy.CheeseLive.ui.dashboard

import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hzy.CheeseLive.BaseFragment
import com.hzy.CheeseLive.R

class DashboardFragment : BaseFragment() {

    private val dashboardViewModel by viewModels<DashboardViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return DashboardViewModel() as T
            }
        }
    }


    override fun initView() {
        val textView: TextView? = root?.findViewById(R.id.text_home)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
            textView?.text = it
        })
    }


    override fun getLayoutId(): Int = R.layout.fragment_dashboard
}