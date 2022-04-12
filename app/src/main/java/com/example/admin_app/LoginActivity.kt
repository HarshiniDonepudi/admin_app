package com.example.admin_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.admin_app.databinding.ActivityLoginBinding
import com.example.admin_app.databinding.ActivityPatientProfileBinding

class LoginActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_login)
        super.onCreate(savedInstanceState)
//        binding = ActivityLoginBinding.inflate(layoutInflater)
//        val view = binding.root
        val login : Button=findViewById(R.id.btnlogin)
        login.setOnClickListener{
            val intent = Intent(this, DandPActivity::class.java)
            startActivity(intent)
        }
    }
}