package com.example.lab_8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab_8.databinding.CarDetailsBinding

class CarDetailsActivity : AppCompatActivity() {
    private lateinit var binding: CarDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CarDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carName = intent.getStringExtra("carName")
        binding.carButton.text = carName
    }
}
