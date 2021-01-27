package com.wyq.logindemo

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object{
        fun startActivity(ctx: Context){
            val i = Intent(ctx, MainActivity::class.java)
            ctx.startActivity(i)
        }
    }
}