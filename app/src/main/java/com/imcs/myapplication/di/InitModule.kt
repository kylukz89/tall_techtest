package com.imcs.myapplication.di

class InitModule {
    module {
        single<WeatherRepository> {
            WeatherRepositoryImpl(get())
        }
    }
}
