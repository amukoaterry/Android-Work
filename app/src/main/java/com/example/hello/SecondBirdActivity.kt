package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnprev1.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1467373766/photo/baltimore-oriole-songbird-standing-on-tree-branch-in-morning-light.webp?b=1&s=170667a&w=0&k=20&c=rz9LVAfVxMamiNJ0wQ-W7kAptQDpxqmPyBg1qpY4d_E=")
            .fit()
//            .resize(500,500)
            .into(binding.bird2)
    }
}