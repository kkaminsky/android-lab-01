package com.example.lab01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main2)
    }


    fun clickButton(view: View){

        val intent = Intent()

        val textFiled = findViewById<EditText>(R.id.editText)
        intent.putExtra("text",textFiled.text.toString())
        setResult(-1,intent)
        finish()
    }

}
