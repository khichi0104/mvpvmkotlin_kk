package com.example.kuk.mvpvmkotlinkuk.mvpvmkotlin.Book.itf

/**
 * Created by kuk on 4/20/2018 AD.
 */
interface IBook {

    interface IView{

        fun onBind(viewModel: BookView)
    }
}