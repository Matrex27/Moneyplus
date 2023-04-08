package com.example.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.money.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }




}