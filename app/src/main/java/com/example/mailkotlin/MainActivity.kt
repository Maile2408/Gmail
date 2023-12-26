package com.example.mailkotlin

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.ActionBar
import com.example.mailkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val mail = arrayOf(
            Mail("ndhuy3000ride",
                "I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.”",
                "7:09 PM",
                true),
            Mail("ndhuy1509",
            "You know you’re in love when you can’t fall asleep because reality is finally better than your dreams.",
            "11:11 AM",
            true),
            Mail("yuhxxx",
            "I am who I am because of you. You are every reason, every hope, and every dream I’ve ever had.",
            "9:26 AM",
            true),
            Mail("ndhuy2002hp",
            "Take my hand, take my whole life too. For I can’t help falling in love with you.",
            "10:10 PM",
            true),
            Mail("nguyenduchuy",
            "You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement.",
            "3:14 PM",
            true))
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar?.title = "      Inbox"
        actionBar?.setIcon(R.drawable.whitemenu)
        actionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        val myListAdapter = MailAdapter(this, mail)
        binding.mailView.adapter = myListAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }
}