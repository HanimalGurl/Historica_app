package com.example.historicaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomescreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
    }

    fun launchAct2 (view: View) {
        val newIntent = Intent(this, GameActivity::class.java)
        startActivity(newIntent)
    }

}