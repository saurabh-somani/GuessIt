package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Project          : andfun-kotlin-guess-it-starter-code
 * Revision History : version 1
 * Date             : 06/07/21
 * Original author  : saurabh
 * Description      : Initial version
 */
class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>(finalScore)
    val score: LiveData<Int>
        get() = _score

    private val _eventPlayAgain = MutableLiveData<Boolean>(false)
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init {
        Log.i(TAG, "init: ")
    }

    fun onEventPlayAgain() {
        _eventPlayAgain.value = true
    }

    fun onEventPlayAgainFinished() {
        _eventPlayAgain.value = false
    }

    companion object {
        private const val TAG = "ScoreViewModel"
    }
}