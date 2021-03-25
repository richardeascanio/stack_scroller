package com.richard.stackapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.richard.stackapplication.adapters.PhotosAdapter
import com.richard.stackapplication.bindingadapters.PhotoRowBindingAdapter
import com.richard.stackapplication.databinding.ActivityMainBinding
import com.richard.stackapplication.util.SliderTransformer

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mAdapter by lazy { PhotosAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAdapter.setData(PhotoRowBindingAdapter.getListOfPhotos())
        initViewPager()
    }

    private fun initViewPager() = binding.photosViewPager.apply {
        adapter = mAdapter
        offscreenPageLimit = 3
        setPageTransformer(SliderTransformer(3))
    }

}