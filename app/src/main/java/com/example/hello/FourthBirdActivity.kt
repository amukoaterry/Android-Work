package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdFourthActivity: AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, ThirdFourthActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1613891188927-14c2774fb8d7?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.bird4)
    }
}