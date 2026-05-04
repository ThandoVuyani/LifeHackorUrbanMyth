package com.example.lifehackorurbanmyth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class QuizActivity : AppCompatActivity() {

    // List of life hacks (statement resId, isTrue, explanation resId)
    private val hacks = listOf(
        Hack(R.string.hack_toothpaste_statement, false, R.string.hack_toothpaste_explanation),
        Hack(R.string.hack_keyboard_statement, true, R.string.hack_keyboard_explanation),
        Hack(R.string.hack_onions_statement, true, R.string.hack_onions_explanation),
        Hack(R.string.hack_battery_statement, false, R.string.hack_battery_explanation),
        Hack(R.string.hack_salt_statement, true, R.string.hack_salt_explanation),
        Hack(R.string.hack_cart_statement, false, R.string.hack_cart_explanation)
    )

    private var currentHackIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val textQuiz = findViewById<TextView>(R.id.textQuiz)
        val textQuestion = findViewById<TextView>(R.id.textQuestion)
        val textFeedback = findViewById<TextView>(R.id.textFeedback)
        val buttonHack = findViewById<Button>(R.id.buttonHack)
        val buttonMyth = findViewById<Button>(R.id.buttonMyth)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        textQuiz.setText(R.string.quiz)

        loadHack(textQuestion, textFeedback)

        buttonHack.setOnClickListener {
            checkAnswer(true, textFeedback)
        }

        buttonMyth.setOnClickListener {
            checkAnswer(false, textFeedback)
        }

        buttonNext.setOnClickListener {
            currentHackIndex++
            if (currentHackIndex < hacks.size) {
                loadHack(textQuestion, textFeedback)
                textFeedback.visibility = View.INVISIBLE
            } else {
                val intent = Intent(this, ScoreActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("total", hacks.size)
                startActivity(intent)
                finish()
            }
        }
    }

    private fun loadHack(hackView: TextView, feedbackView: TextView) {
        val currentHack = hacks[currentHackIndex]
        hackView.setText(currentHack.statement)
        feedbackView.setText(currentHack.explanation)
        feedbackView.visibility = View.INVISIBLE
    }

    private fun checkAnswer(userAnswerIsTrue: Boolean, feedbackView: TextView) {
        val currentHack = hacks[currentHackIndex]
        val isCorrect = currentHack.isTrue == userAnswerIsTrue

        feedbackView.visibility = View.VISIBLE
        val explanation = getString(currentHack.explanation)
        if (isCorrect) {
            score++
            feedbackView.text = getString(R.string.correct_feedback, explanation)
        } else {
            feedbackView.text = getString(R.string.incorrect_feedback, explanation)
        }
    }
}
