package com.pc.mvpdemo.feature.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pc.mvpdemo.R
import com.pc.mvpdemo.base.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showLoading() {
        TODO("Not yet implemented")
    }

    override fun hideLoading() {
        TODO("Not yet implemented")
    }

    override fun showResult(result: String) {
        TODO("Not yet implemented")
    }

    override fun show(error: String) {
        TODO("Not yet implemented")
    }
}
