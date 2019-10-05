package com.example.lab01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.view.Gravity
import android.R.attr.data
import android.app.Activity
import android.graphics.Color
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        button = findViewById(R.id.button)
        setContentView(R.layout.activity_main)
    }

    fun changeColor(view: View) {
        Log.d("INFO", "Button change color clicked!")
        val intent = Intent(this, Main2Activity::class.java)
        startActivityForResult(intent,1)
    }

    fun changeText(view: View){
        Log.d("INFO", "Button change text clicked!")
        val intent = Intent(this, Main2Activity::class.java)
        startActivityForResult(intent,2)
    }

    fun changeSize(view: View){
        Log.d("INFO", "Button change size clicked!")
        val intent = Intent(this, Main2Activity::class.java)
        startActivityForResult(intent,3)
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        Log.d("INFO", "requestCode = $requestCode, resultCode = $resultCode");

        val str = data!!.getStringExtra("text")

        val helloWorldText = findViewById<TextView>(R.id.textView)

        if (requestCode == 1) {
            helloWorldText.setTextColor(Color.parseColor(str))
            Log.d("INFO/str", str)
        }
        if (requestCode == 2){
            helloWorldText.text = str
            Log.d("INFO/str", str)
        }

        if (requestCode == 3){
            helloWorldText.textSize = str.toFloat()
            Log.d("INFO/str", str)
        }

    }
}
