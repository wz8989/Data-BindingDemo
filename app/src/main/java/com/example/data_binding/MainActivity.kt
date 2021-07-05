package com.example.data_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.data_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p = Person( "Ali", "ali@gmail.com", "123456789", "20 Jalan Ekar 123")

            binding.personDetail = p

        }

        binding.btnSecond.setOnClickListener(){

            var p = Person( "Abu", "abu@gmail.com", "123456789", "50 Jalan Ekar abc")

            binding.personDetail = p

        }

    }
}