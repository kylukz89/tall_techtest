package com.imcs.myapplication

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    private val viewModel: WeatherViewModel by viewModel()

    private val searchCityBar by lazy {
        findViewById<AppCompatEditText>(R.id.city_search_name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViews()
        setupListener()
    }

    fun setupViews() {
        searchCityBar.addTextChangedListener(
            object : TextWatcher {
                override fun afterTextChanged(p0: Editable?) {}
                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    val cityTyped = searchCityBar.text
                    if (cityTyped.isNullOrEmpty().not()) {
                        viewModel.fetchCityByName(cityTyped.toString())
                    }
                }
            }
        )
    }

    fun setupListener() {
        viewModel.cityWeather.observer(this) {

        }
    }
}
