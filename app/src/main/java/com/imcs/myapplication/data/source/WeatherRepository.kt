package com.imcs.myapplication.data.source

import com.imcs.myapplication.data.repository.WeatherRepository

class WeatherRepositoryImpl(
    private val api: WeatherAPI
) : WeatherRepository {

    override suspend fun fetchCityByName(name: String): City {
        val response = api.fetchCityByName()
        return City(
            id = 123,
            name = "Sao Paulo",
            lat = "123123213",
            long = "342444"
        )
    }

    override suspend fun fetchWeatherByCity(lat: String, long: String): CityWeather {
        val response = api.fetchWeatherByCity(lat, long)
        return CityWeather(
            "sun"
        )
    }
}

data class City(
    val id: Int,
    val name: String,
    val lat: String?,
    val long: String?,
)

data class CityWeather(
    val someWeather: String
)