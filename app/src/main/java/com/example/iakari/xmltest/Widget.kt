package com.example.iakari.xmltest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_widget.*

class Widget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)

        // Button
        button.setOnClickListener{
            Toast.makeText(this, "This is Button", Toast.LENGTH_SHORT).show()
        }

        // ToggleButton
        toggleButton.setOnClickListener {
            if(toggleButton.isChecked){
                // Onの場合
                checkedTextView.setCheckMarkDrawable(R.drawable.sw_on)
            } else {
                // Offの場合
                checkedTextView.setCheckMarkDrawable(R.drawable.sw_off)
            }
        }
    }
}
