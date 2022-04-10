package com.example.admin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.example.admin_app.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var dbref : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        dbref = FirebaseDatabase.getInstance().getReference("Doctors")
        val id = binding.editText1.editableText
        val name = binding.editText2.editableText
        val spec = binding.editText3.editableText
        val about = binding.editText4.editableText
        val img_url = binding.editText5.editableText
        val exp = binding.editText6.editableText
        val avl = binding.editText7.editableText
        val timeslot = binding.editText8.editableText
        val lang = binding.editText9.editableText



        val data = Helper(2,"Karan","sepc","about","dgfsdyf","5yrs",
            arrayListOf(1,2,3), listOf(listOf(1,1,1), listOf(1,0,1), listOf(0,0,1), listOf(0,0,0),listOf(0,0,0), listOf(0,0,0), listOf(0,0,0)),
            "English,Telugu,Hindi")
        binding.button.setOnClickListener {
            dbref.child(data.id.toString()).setValue(data)
        }
        super.onCreate(savedInstanceState)
        setContentView(view)

    }
}