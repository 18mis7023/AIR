package com.hemanth.air

import android.os.Bundle
import android.widget.EditText
import android.widget.RatingBar
import android.widget.RatingBar.OnRatingBarChangeListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var ratingdisplay1:TextView
    lateinit var ratingdisplay2:TextView
    lateinit var ratingfeedback1:RatingBar
    lateinit var ratingfeedback2:RatingBar
    lateinit var etfeedback1:EditText
    lateinit var etfeedback2:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         ratingdisplay1=findViewById(R.id.ratingdisplay1)
         ratingdisplay2=findViewById(R.id.ratingdisplay2)
        ratingfeedback1=findViewById(R.id.ratingfeedback1)
        ratingfeedback2=findViewById(R.id.ratingfeedback2)
        etfeedback1=findViewById(R.id.etfeedback1)
        etfeedback2=findViewById(R.id.etfeedback2)

        ratingdisplay1.text="${ratingfeedback1.rating}/5"
        ratingdisplay2.text="${ratingfeedback2.rating}/5"

        ratingfeedback1.setOnRatingBarChangeListener(OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            ratingdisplay1.setText("$rating/5")
        })
        ratingfeedback2.setOnRatingBarChangeListener(OnRatingBarChangeListener { ratingBar, rating, fromUser ->
            ratingdisplay2.setText("$rating/5")
        })

    }
}


