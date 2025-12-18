package com.imcs.myapplication.entity

data class CityResponse(
    val id: Int?,
    val name: String?,
    val lat: String?,
    val long: String?,
)

data class CityWeatherResponse(
    val someWeather: String?
)