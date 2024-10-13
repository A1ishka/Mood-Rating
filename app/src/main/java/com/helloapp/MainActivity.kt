package com.helloapp

import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        title = "RatingBar";
        val ratingBar: RatingBar = findViewById(R.id.mood_rating_bar)
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            val message = when (rating) {
                0f -> "Не стоит опускать руки!"
                0.5f -> "Не стоит опускать руки!"
                1f -> "Скоро всё наладится!"
                1.5f -> "Скоро всё наладится!"
                2f -> "Жизнь полна возможностей"
                2.5f -> "Жизнь полна возможностей"
                3f -> "Стоит отдохнуть и продолжать путь!"
                3.5f -> "Стоит отдохнуть и продолжать путь!"
                4f -> "Так держать!"
                4.5f -> "Так держать!"
                5f -> "Отлично!"
                else -> "Нужно оценить настроение!"
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}