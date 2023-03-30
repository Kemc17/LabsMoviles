package com.kemc.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var fiveCentIV : ImageView
    private lateinit var tenCentIV: ImageView
    private lateinit var quarterIV: ImageView
    private lateinit var dollarIV: ImageView
    private lateinit var cashTV: TextView

    private var money = 0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentIV = findViewById(R.id.five_cent_iv)
        tenCentIV = findViewById(R.id.ten_cent_iv)
        quarterIV = findViewById(R.id.quarter_cent_iv)
        dollarIV = findViewById(R.id.dollar_iv)
        cashTV = findViewById(R.id.money_tv)

        fiveCentIV.setOnClickListener{
            money += 0.05
            money = String.format("%.2f", money).toDouble()
            cashTV.text = "$${money}"
        }

        tenCentIV.setOnClickListener{
            money += 0.10
            money = String.format("%.2f", money).toDouble()
            cashTV.text = "$${money}"
        }

        quarterIV.setOnClickListener{
            money += 0.25
            money = String.format("%.2f", money).toDouble()
            cashTV.text = "$${money}"
        }

        dollarIV.setOnClickListener{
            money += 1.00
            money = String.format("%.2f", money).toDouble()
            cashTV.text = "$${money}"
        }


    }
}