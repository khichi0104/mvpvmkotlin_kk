package com.example.kuk.mvpvmkotlinkuk.core

import com.example.kuk.mvpvmkotlinkuk.core.converter.ToStringConverterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by kuk on 4/19/2018 AD.
 */
interface ApiInterface {
    val BASE_URL: String
        get() = "http://apidev.handigo.run"

    fun initEndPoint(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ToStringConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    fun initEndPoint(url: String): Retrofit {
        return Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(ToStringConverterFactory())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

}