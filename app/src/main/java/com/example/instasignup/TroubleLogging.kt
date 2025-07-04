package com.example.instasignup

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.instasignup.databinding.ActivityTroubleLoggingBinding

class TroubleLogging : AppCompatActivity() {
    private lateinit var binding: ActivityTroubleLoggingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityTroubleLoggingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createNewAccTv.setOnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
            finish()
        }

        binding.backToLoginTv.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}