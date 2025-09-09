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

        val btn = findViewById<Button>(R.id.button)
        val txtView = findViewById<TextView>(R.id.textView)
        val txtEdit = findViewById<EditText>(R.id.editText)

        btn.setOnClickListener {
            var name = txtEdit.text
            if (name.isNullOrBlank()){
                txtView.setText("Please enter your name!")
                txtView.setTextColor(Color.RED)
            } else {
                txtView.setText("Hello $name!")
                txtView.setTextColor(Color.BLACK)
            }
        }

    }
}