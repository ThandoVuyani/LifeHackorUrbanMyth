package com.example.lifehackorurbanmyth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ScoreActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)


        val textScore = findViewById<TextView>(R.id.textTotalScore)
        val textMessage = findViewById<TextView>(R.id.textScoreFeedback)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)

        textScore.text = getString(R.string.score_format, score, total)

        textMessage.setText(if (score >= total / 4) {
            R.string.msg_master
            } else {
            R.string.msg_stay_safe
        })
    }
}
