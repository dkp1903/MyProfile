package com.example.home.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    var photo: ImageView? = null
    var eduButton: Button? = null
    var workButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        photo = findViewById(R.id.profilePhoto)
        photo?.setOnClickListener({
            var clickIntent = Intent(this@MainActivity, ProfilePhoto::class.java)//which activity we are on, which activity we wish to jump to
            startActivity(clickIntent)
        })


        eduButton = findViewById(R.id.edu)
        eduButton?.setOnClickListener({
            var clickIntent2 = Intent(this@MainActivity, Education::class.java)
            startActivity(clickIntent2)
        })

        workButton = findViewById(R.id.work)
        workButton?.setOnClickListener({
            var clickIntent3 = Intent(this@MainActivity, WorkExperience::class.java)
            startActivity(clickIntent3)
        })
    }

    }

