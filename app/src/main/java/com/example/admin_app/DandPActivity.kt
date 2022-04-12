package com.example.admin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.admin_app.databinding.ActivityDandPactivityBinding
import com.example.admin_app.databinding.ActivityPatientProfileBinding

class DandPActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dand_pactivity)
        val doctors : Button=findViewById(R.id.doctors)
        val patients : Button=findViewById(R.id.patients)
        doctors.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        patients.setOnClickListener{
            val intent = Intent(this, PatientActivity::class.java)
            startActivity(intent)
        }
    }
}