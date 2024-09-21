package com.espinoza_manuel.quiz_app

import android.util.Log
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {

    private val questionBank = listOf(
        Question(R.string.question, true),
        Question(R.string.question_2, false),
        Question(R.string.question_3, false),
        Question(R.string.question_4, true))

    private var currentIndex = 0
    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer
    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId
    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }
}


