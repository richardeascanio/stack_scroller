package com.richard.stackapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.richard.stackapplication.databinding.PhotoRowLayoutBinding
import com.richard.stackapplication.models.Photo
import com.richard.stackapplication.util.PhotosDiffUtil

class PhotosAdapter : RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>() {

    private var photosList = emptyList<Photo>()

    class PhotosViewHolder(
        private val binding: PhotoRowLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(photo: Photo) {
            binding.photo = photo
            binding.executePendingBindings()
        }

        companion object {

            fun from(parent: ViewGroup): PhotosViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = PhotoRowLayoutBinding.inflate(
                    layoutInflater,
                    parent,
                    false
                )
                return PhotosViewHolder(binding)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        return PhotosViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        val currentPhoto = photosList[position]
        holder.bind(currentPhoto)
    }

    override fun getItemCount(): Int {
        return photosList.size
    }

    fun setData(newData: List<Photo>) {
        val photoDiffUtil = PhotosDiffUtil(photosList, newData)
        val diffUtilPhotos = DiffUtil.calculateDiff(photoDiffUtil)
        photosList = newData
        diffUtilPhotos.dispatchUpdatesTo(this)
    }

}