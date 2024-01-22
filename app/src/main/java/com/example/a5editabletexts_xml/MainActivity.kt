package com.example.a5editabletexts_xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5editabletexts_xml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            val firstNumber = binding.etNumber1.text.toString().toInt()
            val secondNumber = binding.etNumber2.text.toString().toInt()
            val result = firstNumber + secondNumber
            binding.tvResult.text = result.toString()
        }
    }
}