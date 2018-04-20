package com.example.kuk.mvpvmkotlinkuk.core.data

/**
 * Created by kuk on 4/19/2018 AD.
 */

data class ApiResponse<out T>(val Status: Int, val Message: String, val data: T)