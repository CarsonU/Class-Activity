package edu.temple.classactivity

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            var name = findViewById<EditText>(R.id.editText).text
            if (name.isNullOrBlank()){
                findViewById<TextView>(R.id.textView).text = "Please enter your name!"
                findViewById<TextView>(R.id.textView).setTextColor(Color.RED)
            } else {
                findViewById<TextView>(R.id.textView).text = "Hello $name!"
            }
        }

    }
}