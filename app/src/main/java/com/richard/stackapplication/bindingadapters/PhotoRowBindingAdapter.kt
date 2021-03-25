package com.richard.stackapplication.bindingadapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import com.richard.stackapplication.R
import com.richard.stackapplication.models.Credit
import com.richard.stackapplication.models.Photo

class PhotoRowBindingAdapter {

    companion object {

        @BindingAdapter("loadImageFromUrl")
        @JvmStatic
        fun loadImageFromUrl(imageView: ImageView, imageUrl: String) {
            imageView.load(imageUrl) {
                crossfade(true)
                crossfade(600)
                error(R.drawable.ic_error_placeholder)
            }
        }

        fun getListOfPhotos(): List<Photo> {
            val photos = mutableListOf<Photo>()

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1589491106922-a8e488665b2c?ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80",
                    Credit("Bechir Kaddech", "@bechir", "https://unsplash.com/@bechir"),
                    "Marina, Sidi bousaid, Tunisia"
                )
            )

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1556011572-d786c300819f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80",
                    Credit("Adrian Dascal", "@dascal", "https://unsplash.com/@dascal"),
                    "Downtown, Tunis, Tunisia"
                )
            )

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1540552999122-a0ac7a9a0008?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=668&q=80",
                    Credit("Janik Lierfeld", "@janiklie", "https://unsplash.com/@janiklie"),
                    "Mahdia, Tunisia"
                )
            )

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1523971436722-f144a6a5dc60?ixlib=rb-1.2.1&auto=format&fit=crop&w=1295&q=80",
                    Credit("Naomi Koelemans", "@naomikoelemans", "https://unsplash.com/@naomikoelemans"),
                    "Tozeur, Tunisia"
                )
            )

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1556901599-6cd86f3da8b1?ixlib=rb-1.2.1&auto=format&fit=crop&w=2533&q=80",
                    Credit("Haythem Gataa", "@haythemgataa", "https://unsplash.com/@haythemgataa"),
                    "Mosque Okba, kairouan, Tunisia"
                )
            )

            photos.add(
                Photo(
                    "https://images.unsplash.com/photo-1565689478170-6624de957899?ixlib=rb-1.2.1&auto=format&fit=crop&w=668&q=80",
                    Credit("Adrian Dascal", "@dascal", "https://unsplash.com/@dascal"),
                    "Avenue, Hammamet, Tunisia"
                )
            )

            return photos

        }

    }

}