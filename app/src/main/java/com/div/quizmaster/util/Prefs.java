package com.div.quizmaster.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    public static final String HIGHEST_SCORE = "highest_score";
    public static final String STATE = "trivia_state";
    private final SharedPreferences preferences;

    public Prefs(Activity context) {
        this.preferences = context.getPreferences(Context.MODE_PRIVATE);
    }

    public void saveHighestScore(int score) {
        int lastScore = preferences.getInt(HIGHEST_SCORE, 0);

        if (score > lastScore) {
            // We have a new highest score
            preferences.edit().putInt(HIGHEST_SCORE, score).apply();

        }

    }

    public int getHighestScore() {
        return preferences.getInt(HIGHEST_SCORE, 0);
    }

    public void setState(int index) {
        preferences.edit().putInt(STATE, index).apply();
    }
    public int getState() {
        return preferences.getInt(STATE, 0);
    }
}

