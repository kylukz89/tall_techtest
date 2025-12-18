package com.imcs.myapplication

import android.os.Bundle
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : BaseActivity() {

    private val searchCityBar: AppCompatEditText by lazy {
        findViewById(R.id.city_search_name)
    }

    override fun setContentLayout(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun setupViews() {

    }
}
