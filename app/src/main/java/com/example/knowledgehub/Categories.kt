package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Categories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

    }

    fun contact(view: View) {
        val callIntent= Intent(Intent.ACTION_DIAL,Uri.parse("tel:" +"6299886629"))
        startActivity(callIntent)
    }

    fun androidDesc(view: View) {
        intent=Intent(this,And_detail::class.java)
        startActivity(intent)
    }

    fun webDevDesc(view: View) {
        intent=Intent(this,WebDev::class.java)
        startActivity(intent)
    }

    fun iosDesc(view: View) {
        intent=Intent(this,IosDev::class.java)
        startActivity(intent)
    }

    fun aiSetup(view: View) {
        intent=Intent(this,AiSetup::class.java)
        startActivity(intent)
    }

    fun web3Setup(view: View) {
        intent=Intent(this,Web3Setup::class.java)
        startActivity(intent)
    }

    fun blockChainSetup(view: View) {
        intent=Intent(this,BlockChain::class.java)
        startActivity(intent)
    }

}