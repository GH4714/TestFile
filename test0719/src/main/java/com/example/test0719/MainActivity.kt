package com.example.test0719

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test0719.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.ToRegister.setOnClickListener{
            val intent: Intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.ToLogin.setOnClickListener{
            val intent: Intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}