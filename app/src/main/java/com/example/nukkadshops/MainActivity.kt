package com.example.nukkadshops

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var v:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        v=findViewById(R.id.recyclerView)
        val a=Adapter(this,listss.alist)
        v.adapter=a
        //gridview
        val gridview=GridLayoutManager(this,3)
        v.layoutManager=gridview
        text()
    }
    private fun text() {
        val spannableString = SpannableString("Device Name: DEVICE123")
        val fColor = ForegroundColorSpan(Color.rgb(3, 169, 244))
        spannableString.setSpan(fColor, 13, 22, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        text.text = spannableString
    }
}
