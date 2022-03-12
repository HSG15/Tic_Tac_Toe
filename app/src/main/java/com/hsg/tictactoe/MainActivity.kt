package com.hsg.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ttt.translationX = -1000f
        TicTacToe.translationX = 1000f
        Lucky.translationY = 1000f

        ttt.animate().translationX(0f).duration = 2000
        TicTacToe.animate().translationX(0f).duration = 2000
        Lucky.animate().translationY(0f).duration = 2000

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,StartActivity::class.java)
            startActivity(intent)
        },3000)
    }
}


