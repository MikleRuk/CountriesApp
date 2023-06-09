package com.panevrn.countriesapp

import android.widget.ImageView
import coil.ComponentRegistry
import coil.ImageLoader
import coil.decode.SvgDecoder
import coil.load
import coil.request.ImageRequest
import com.example.countriesapp.Languages
import java.text.NumberFormat
import java.util.*


fun languagesToString(languages: List<Languages>): String {

    return languages.joinToString { it.name }
}

fun formatNumber(number: Long) :String{

    val string = NumberFormat.getInstance().format(number)
    return string

}

//suspend fun loadSvg(imageView: ImageView, url: String) {
//    if (url.lowercase(Locale.ENGLISH).endsWith("svg")) {
//        val imageLoader = ImageLoader.Builder(imageView.context)
//            .components(fun ComponentRegistry.Builder.() {
//                add(SvgDecoder(imageView.context))
//            })
//            .build()
//        val request = ImageRequest.Builder(imageView.context)
//            .data(url)
//            .target(imageView)
//            .build()
//        imageLoader.execute(request)
//    } else {
//        imageView.load(url)
//    }
//}




