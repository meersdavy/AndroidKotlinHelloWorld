package net.davymeers.androidkotlinhelloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this,"Hello Toast", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View) {
        var count =  getCount()
        count++

       setCount(count)
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, getCount())
        startActivity(randomIntent)
    }

    private fun getCount():Int{
        val countString = textView.text.toString()
        return Integer.parseInt(countString)
    }

    private fun setCount(count :Int){
        textView.text = count.toString()
    }
}
