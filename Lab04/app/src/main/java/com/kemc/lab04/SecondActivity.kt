package com.kemc.lab04

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kemc.lab04.R
import android.telephony.SmsManager
import android.widget.Toast



class SecondActivity : AppCompatActivity() {
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var telTextView: TextView
    private lateinit var actionShareImplicit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nameTextView = findViewById(R.id.name_text_view)
        emailTextView = findViewById(R.id.email_text_view)
        telTextView = findViewById(R.id.tel_text_view)
        actionShareImplicit = findViewById(R.id.action_share_implicit)

        var nameShared = intent.getStringExtra("name").toString()
        var emailShared = intent.getStringExtra("email").toString()
        var telShared = intent.getStringExtra("tel").toString()

        nameTextView.text = "Nombre: ${nameShared}"
        emailTextView.text = "Correo: ${emailShared}"
        telTextView.text = "Teléfono: ${telShared}"


    }
}