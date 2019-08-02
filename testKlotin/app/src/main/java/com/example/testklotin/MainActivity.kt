package com.example.testklotin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        //supportActionBar?.hide();


        ImgbtnText.text = "All Task".toUpperCase();
        ImgbtnText.setTextColor(Color.parseColor("#76dc58"));



        Imgbtn2Text.text = "Work".toUpperCase();
        Imgbtn2Text.setTextColor(Color.parseColor("#76dc58"));

        Imgbtn3Text.text = "Add List".toUpperCase();
        Imgbtn3Text.setTextColor(Color.parseColor("#76dc58"));


        Imgbtn4Text.text = "Personal".toUpperCase();
        Imgbtn4Text.setTextColor(Color.parseColor("#76dc58"));

        Imgbtn.setOnClickListener {
            val intent = Intent(this, List::class.java);
            startActivity(intent);
        }

        Imgbtn3.setOnClickListener {
            val intent = Intent(this, Add_Card::class.java);
            startActivity(intent);
        }

    }
}
