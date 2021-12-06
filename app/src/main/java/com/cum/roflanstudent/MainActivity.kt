package com.cum.roflanstudent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)
    }

    fun onClickLogin(view: android.view.View) {
        val intent = Intent(this@MainActivity, ProfileActivity::class.java)
        startActivity(intent)
    }
}