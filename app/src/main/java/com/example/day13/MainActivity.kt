package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

        companion object{
            const val KEY="com.example.day13.MaiActivity"
        }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnOrder=findViewById<Button>(R.id.btn)

            val textOrder1=findViewById<EditText>(R.id.eT1)
            val textOrder2=findViewById<EditText>(R.id.eT2)
            val textOrder3=findViewById<EditText>(R.id.eT3)
            val textOrder4=findViewById<EditText>(R.id.eT4)
            val textOrder5=findViewById<EditText>(R.id.eT5)

            btnOrder.setOnClickListener {

                val orderPlaced=textOrder1.text.toString() + " " +textOrder2.text.toString() + " " +
                        textOrder3.text.toString() + " " + textOrder4.text.toString() + " " +textOrder5.text.toString()

                intent= Intent(this,Order::class.java)
                intent.putExtra(KEY,orderPlaced)
                startActivity(intent)
            }
        }
    }

