package com.example.assignment2

import android.icu.text.AlphabeticIndex.ImmutableIndex
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


public class page2 : AppCompatActivity() {

    private lateinit var txtHunger: TextView
    private lateinit var txtClean: TextView
    private lateinit var txtPlay: TextView
    private lateinit var btnFeed: Button
    private lateinit var btnClean: Button
    private lateinit var btnPlay: Button
    private lateinit var yodaImageView: ImageView

    private var yodaArray = arrayOf(R.drawable.assignment_2_bakground, R.drawable.yoda_eating, R.drawable.yodasleeping, R.drawable.yodaplaying)

    private val initialImage = 0

    private var hunger = 0
    private var clean = 0
    private var play = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        yodaImageView = findViewById<ImageView>(R.id.yodaImageView)
        btnFeed = findViewById<Button>(R.id.btnFeed)
        btnClean = findViewById<Button>(R.id.btnClean)
        btnPlay = findViewById<Button>(R.id.btnPlay)
        txtHunger = findViewById<TextView>(R.id.txtHunger)
        txtClean = findViewById<TextView>(R.id.txtClean)
        txtPlay = findViewById<TextView>(R.id.txtPlay)

        yodaImageView.setImageResource(yodaArray[initialImage])

        btnFeed.setOnClickListener {
            imageDisplay_yoda(1)
            hunger()
        }
        btnClean.setOnClickListener {
            imageDisplay_yoda(2)
            clean()
        }
            btnPlay.setOnClickListener {
                imageDisplay_yoda(3)
                play()
            }

    }
        private fun imageDisplay_yoda(index: Int) {
            if (index in yodaArray.indices)
            {
                yodaImageView.setImageResource(yodaArray[index])
            }

        }
        private fun hunger() {
            if (hunger < 100) {
                hunger += 10
                txtHunger.text = hunger.toString()
            } else {
                txtHunger.text = "I am full"
            }
        }

        private fun clean() {
                if (clean < 100) {
                    clean += 10
                    txtClean.text = clean.toString()
                } else {
                    txtClean.text = "I am clean"
                }
            }
                private fun play() {
                    if (play < 100) {
                        play += 10
                        txtPlay.text = play.toString()
                    } else {
                        txtPlay.text = "Happy!!!"
                    }
                }
    // Check
            }
















