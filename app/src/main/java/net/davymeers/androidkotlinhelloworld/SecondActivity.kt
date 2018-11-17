package net.davymeers.androidkotlinhelloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    private fun showRandomNumber(){
        val maxValue = intent.getIntExtra(TOTAL_COUNT,0)

        val random = Random()

        var randomInt = 0
        if (maxValue > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(maxValue + 1)
        }

        textView_random.text =Integer.toString(randomInt)
        textView_label.text = getString(R.string.random_heading, maxValue)
    }
}
