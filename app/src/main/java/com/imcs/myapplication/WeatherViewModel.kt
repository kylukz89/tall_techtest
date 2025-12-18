package com.imcs.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class WeatherViewModel(
    private val weatherRepositry: WeatherRepository
) : ViewModel() {

    private val _cityWeather = MutableLiveData<CityWeather>()
    val cityWeather: LiveData<CityWeather> = _cityWeather

    fun fetchCityByName(name: String?) {
        name?.let {
            viewModelScope.launch {
                weatherRepositry.fetchCityByName(it).also {
                    fetchWeatherByCity(it.lat, it.long)
                }
            }
        }
    }

    fun fetchWeatherByCity(lat: String?, long: String?) {
        if (lat.isNullOrEmpty() || long.isNullOrEmpty()) return
        viewModelScope.launch {
            weatherRepositry.fetchWeatherByCity(lat, long).also {
                _cityWeather.postValue(it)
            }
        }
    }
}
