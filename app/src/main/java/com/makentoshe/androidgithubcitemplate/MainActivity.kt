package com.makentoshe.androidgithubcitemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView1)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            image.setImageResource(R.drawable.menquest)
            println("click on button 1 ")
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            image.setImageResource(R.drawable.manyquest)
            println("click on button 2")
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            image.setImageResource(R.drawable.redquest)
            println("click on button 3")
        }

    }
}
