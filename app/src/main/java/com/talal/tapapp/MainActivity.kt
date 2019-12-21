package com.talal.tapapp

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View) {
        counter++

        val textView = findViewById(R.id.textView) as TextView
        textView.text = ("You Clicked $counter Times")

        object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                textView2.setText("seconds remaining: " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                textView2.setText("done!")
            }
        }.start()
    }
}
