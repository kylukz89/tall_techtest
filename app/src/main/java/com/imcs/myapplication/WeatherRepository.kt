package com.imcs.myapplication

interface WeatherRepository {
    suspend fun fetchCityByName(name: String): City
    suspend fun fetchWeatherByCity(lat: String, long: String): CityWeather
}

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