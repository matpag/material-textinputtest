package com.matpag.materialpublictesting

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    private lateinit var textInput: TextInputLayout
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.textinput_test)

        button = findViewById(R.id.button_test)
        button.setOnClickListener {
            toggleHelperTextAndAddError()
            toggleHelperTextAndAddError()
            toggleHelperTextAndAddError()
            //or you can just click 3 time the button using only 1 line, it has the same effect
            //and the error message will never appear
        }
    }

    private fun toggleHelperTextAndAddError() {
        textInput.isHelperTextEnabled = !textInput.isHelperTextEnabled
        textInput.error = "I'm an error"
    }
}
