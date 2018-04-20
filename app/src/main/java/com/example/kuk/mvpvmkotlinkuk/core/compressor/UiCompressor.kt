package com.example.kuk.mvpvmkotlinkuk.core.compressor

/**
 * Created by kuk on 4/19/2018 AD.
 */
import android.content.Context
import android.widget.Toast

fun Any.toast(context: Context?, duration: Int) {
    if (context == null) {
        return
    }
    Toast.makeText(context, this.toString(), duration).show()
}