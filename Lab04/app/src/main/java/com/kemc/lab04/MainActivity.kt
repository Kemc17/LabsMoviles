package com.kemc.lab04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.kemc.lab04.test
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: TextInputEditText
    private lateinit var emailEditText: TextInputEditText
    private lateinit var telEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.tvNombre)
        emailEditText = findViewById(R.id.tvCorreo)
        telEditText = findViewById(R.id.tvTelefono)
        actionNext = findViewById(R.id.action_share)

        actionNext.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("email", emailEditText.text.toString())
            intent.putExtra("tel", telEditText.text.toString())
            startActivity(intent)
        }
    }
}