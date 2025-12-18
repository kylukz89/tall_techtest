package com.imcs.myapplication.di

class ModuleInitialization {
    module {
        single<WeatherRepository> {
            WeatherRepositoryImpl(get())
        }
    }
}
