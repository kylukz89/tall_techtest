package com.imcs.myapplication.data.repository

import com.imcs.myapplication.data.source.City
import com.imcs.myapplication.data.source.CityWeather

interface WeatherRepository {
    suspend fun fetchCityByName(name: String): City
    suspend fun fetchWeatherByCity(lat: String, long: String): CityWeather
}
