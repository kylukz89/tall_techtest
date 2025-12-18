package com.imcs.myapplication

import retrofit2.http.GET

interface WeatherAPI {

    @GET("forecast")
    fun fetchWeatherByCity(lat: String, long: String)

}
