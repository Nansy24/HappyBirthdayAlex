package com.example.happybirthdayalex.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happybirthdayalex.R
import com.example.happybirthdayalex.databinding.ActivityPhotosBinding

class PhotosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPhotosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhotosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val photoIdList = listOf(
            R.drawable.photo_2,
            R.drawable.photo_3,
            R.drawable.photo_4,
            R.drawable.photo_5,
            R.drawable.photo_6,
            R.drawable.photo_7,
            R.drawable.photo_8,
            R.drawable.photo_9,
            R.drawable.photo_10,
            R.drawable.photo_11,
            R.drawable.photo_12,
            R.drawable.photo_1
        )
        var i = 0
        binding.bPhoto.setOnClickListener {
            if(i == photoIdList.size) {
                i = 0
            }
            binding.imphoto.setImageResource(photoIdList[i])
            i++
        }
    }
}