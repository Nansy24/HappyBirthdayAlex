package com.example.happybirthdayalex.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happybirthdayalex.R
import com.example.happybirthdayalex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bCong.setOnClickListener {
            val intent = Intent(this, CongratulationActivity::class.java)
            startActivity(intent)
        }
        binding.bPhotos.setOnClickListener {
            val intent = Intent(this, PhotosActivity::class.java)
            startActivity(intent)
        }
    }

}