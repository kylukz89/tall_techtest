package com.imcs.myapplication.data.source

import com.imcs.myapplication.entity.CityResponse
import com.imcs.myapplication.entity.CityWeatherResponse
import retrofit2.http.GET

interface WeatherAPI {

    @GET("v1/search")
    fun fetchCityByName(): CityResponse

    @GET("forecast")
    fun fetchWeatherByCity(lat: String, long: String): CityWeatherResponse
}