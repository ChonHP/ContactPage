package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContactDetail : AppCompatActivity() {
    lateinit var txtName: TextView
    lateinit var txtPhone: TextView
    lateinit var txtEmail: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
        txtName = findViewById(R.id.txtName)
        txtPhone = findViewById(R.id.txtPhone)
        txtEmail = findViewById(R.id.txtEmail)
        val name = intent.getStringExtra("name").toString()
        val phone = intent.getStringExtra("phone").toString()
        val email = intent.getStringExtra("email").toString()
        txtName.text = name
        txtPhone.text = phone
        txtEmail.text = email


    }
}