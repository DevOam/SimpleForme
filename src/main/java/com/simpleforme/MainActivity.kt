package com.simpleforme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var firstName:TextInputEditText
    lateinit var lastName:TextInputEditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialisation()
        btn.setOnClickListener {
            val myIntent:Intent = Intent(this,SecondActivity::class.java)
            myIntent.putExtra("fName", firstName.text.toString())
            myIntent.putExtra("lName", lastName.text.toString())
            startActivity(myIntent)

        }
    }



    private fun initialisation(){
        firstName = findViewById(R.id.fName)
        lastName = findViewById(R.id.lName)
        btn=findViewById(R.id.btn1)
    }
}