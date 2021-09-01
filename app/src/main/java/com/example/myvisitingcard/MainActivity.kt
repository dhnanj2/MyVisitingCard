package com.example.myvisitingcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import android.content.Intent
import android.net.Uri
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    lateinit var AboutMe : TextView
    lateinit var ButtonAM : Button
    val mySelf = "A Pre-Final Year student pursuing Bachelor of Technology in Electronics and communication at University school of Information and communication Technology, Guru Gobind Singh Indraprastha University.\n" +
            "\n" +
            "With Expertise in various programming languages like C/C++, my major interest lies in Designing Efficient Algorithms to solve real life problems and innovating cutting technologies."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonAM = findViewById(R.id.ButtonAM)
        AboutMe=findViewById(R.id.AboutMe)
        AboutMe.setText(mySelf)
        AboutMe.visibility=View.INVISIBLE
    }

    fun ShowAM(view: View) {
        if(AboutMe.isVisible) {
            ButtonAM.setY(ButtonAM.getY() + 50)
            AboutMe.visibility = View.INVISIBLE
        }else {
            ButtonAM.setY(ButtonAM.getY() - 50)
            AboutMe.visibility = View.VISIBLE
        }
    }

    fun open_in(view: View) {
        val uri: Uri = Uri.parse("http://linkedin.com/in/dhnanj")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    fun open_insta(view: View) {
        val uri: Uri = Uri.parse("http://instagram.com/dhnanj2")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
    fun open_mail(view: View) {
        val uri: Uri = Uri.parse("https://mail.google.com/mail/?view=cm&fs=1&to=dhnanj2@gmail.com")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}