package com.quantum_soft.idnpsegundoexamen_parte2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.quantum_soft.idnpsegundoexamen_parte2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var arrowProgressView: ArrowProgressView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrowProgressView = findViewById(R.id.arrowProgressView)

        binding.advanceButton.setOnClickListener {
            arrowProgressView.advanceProgress()
        }

        binding.resetButton.setOnClickListener {
            arrowProgressView.resetProgress()
        }
    }
}