package com.simpleforme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var txt1:TextView
    lateinit var txt2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initialisation()
        val int1 = intent.getStringExtra("fName")
        val int2 = intent.getStringExtra("lName")
        txt1.text = int1
        txt2.text = int2
    }
    private fun  initialisation(){
        txt1=findViewById(R.id.txt1)
        txt2=findViewById(R.id.txt2)
    }
}