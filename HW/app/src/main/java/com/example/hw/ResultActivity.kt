package com.example.hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val result = findViewById<TextView>(R.id.Result)

        if (intent.getStringExtra("OPER") == "+"){
            val sum = intent.getStringExtra("SUM")
            result.text = sum.toString()
        }
        else if (intent.getStringExtra("OPER") == "-"){
            val minus = intent.getStringExtra("MIN")
            result.text = minus.toString()
        }
        else if (intent.getStringExtra("OPER") == "x"){
            val mult = intent.getStringExtra("MUL")
            result.text = mult.toString()
        }
        else if (intent.getStringExtra("OPER") == "/"){
            val div = intent.getStringExtra("DIV")
            result.text = div.toString()
        }

        val backs = findViewById<Button>(R.id.backPage)

        backs.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




    }
}