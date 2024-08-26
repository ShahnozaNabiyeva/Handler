package com.shahnoza.handler

import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView
    var loadingProgress=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        progressBar.setProgress(0,false)
        textView=findViewById(R.id.btnhandler)
        progress()
    }
    fun progress(){
        val handler= Handler()
        handler.postDelayed({
            loadingProgress++
            progressBar.progress = loadingProgress
            textView.text="$loadingProgress%"
            progress()
        },100)
    }


}