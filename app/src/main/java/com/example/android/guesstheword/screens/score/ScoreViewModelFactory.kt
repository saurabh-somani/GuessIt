package com.example.android.guesstheword.screens.score

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

/**
 * Project          : andfun-kotlin-guess-it-starter-code
 * Revision History : version 1
 * Date             : 06/07/21
 * Original author  : saurabh
 * Description      : Initial version
 */
class ScoreViewModelFactory(private val finalScore: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ScoreViewModel(finalScore) as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}