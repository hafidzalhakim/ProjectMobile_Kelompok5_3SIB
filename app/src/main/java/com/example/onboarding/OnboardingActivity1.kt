package com.example.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregister.LoginActivity

class OnboardingActivity1 : AppCompatActivity() {

    var btnNext: Button? = null
    var btnSkip: Button? = null
    var btnBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        btnNext = findViewById(R.id.nextBtn1)
        btnSkip = findViewById(R.id.skipButton1)
        btnBack = findViewById(R.id.backBtn1)


        btnNext?.setOnClickListener {
            startActivity(Intent(applicationContext, OnboardingActivity2 ::class.java))
        }

        btnSkip?.setOnClickListener {
            startActivity(Intent(applicationContext, LoginActivity::class.java))
        }

        btnBack?.setOnClickListener {
            startActivity(Intent(applicationContext, OnboardingActivity1 :: class.java))
        }

    }

}