package com.imcs.myapplication

import retrofit2.http.GET

interface WeatherAPI {

    @GET("v1/search")
    fun fetchCityByName(): CityResponse

    @GET("forecast")
    fun fetchWeatherByCity(lat: String, long: String): CityWeatherResponse
}

data class CityResponse(
    val id: Int?,
    val name: String?,
    val lat: String?,
    val long: String?,
)

data class CityWeatherResponse(
    val someWeather: String?
)