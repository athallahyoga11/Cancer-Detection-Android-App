package com.dicoding.asclepius.view



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.asclepius.R

class SplashActivity : AppCompatActivity() {


    private val splashTimeOut: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler().postDelayed({

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

            finish()
        }, splashTimeOut)
    }
}
