package com.example.hw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sum = findViewById<Button>(R.id.add)
        val minus = findViewById<Button>(R.id.minus)
        val mult = findViewById<Button>(R.id.multiply)
        val div = findViewById<Button>(R.id.divide)
        val editText1 = findViewById<EditText>(R.id.firstNum)
        val editText2 = findViewById<EditText>(R.id.secondNum)


        sum.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val summary: Int = editText1.text.toString().toInt() + editText2.text.toString().toInt()
            intent.putExtra("SUM",summary.toString())
            val operation = sum.text.toString()
            intent.putExtra("OPER",operation)
            startActivity(intent)
        }
        minus.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val minus_f: Int = editText1.text.toString().toInt() - editText2.text.toString().toInt()
            intent.putExtra("MIN",minus_f.toString())
            val operation = minus.text.toString()
            intent.putExtra("OPER",operation)
            startActivity(intent)

        }
        mult.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val multiply: Int = editText1.text.toString().toInt() * editText2.text.toString().toInt()
            intent.putExtra("MUL",multiply.toString())
            val operation = mult.text.toString()
            intent.putExtra("OPER",operation)
            startActivity(intent)

        }
        div.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            val divide: Float = editText1.text.toString().toFloat() / editText2.text.toString().toFloat()
            intent.putExtra("DIV",divide.toString())
           val operation = div.text.toString()
          intent.putExtra("OPER",operation)
            startActivity(intent)

        }


    }
}