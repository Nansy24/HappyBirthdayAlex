package com.example.happybirthdayalex.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happybirthdayalex.R
import com.example.happybirthdayalex.databinding.ActivityCongratulationBinding

class CongratulationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCongratulationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCongratulationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}