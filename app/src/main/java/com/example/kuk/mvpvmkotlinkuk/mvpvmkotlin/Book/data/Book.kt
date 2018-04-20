package com.example.kuk.mvpvmkotlinkuk.mvpvmkotlin.Book.data

import android.databinding.BaseObservable
import java.io.Serializable

/**
 * Created by kuk on 4/20/2018 AD.
 */


/**
 * The model class to store version data in.
 *
 * @param name Name of book
 * @param author Author of book
 * @param title Title of book
 * @param description Description of book
 * @param url Url of book
 * @param imageUrl Image Url of book
 * @param publishDate Publish Date of book
 *
 */
class Book (val name:String, val author:String, val title:String, val description:String,
            val url:String, val imageUrl:String, val publishDate:String): BaseObservable(),Serializable {
        constructor(): this("", "", "", "", "", "", "")
}
