package com.example.labass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SENDDATA (v: View){
        var selectID: Int = radioGroup.checkedRadioButtonId
        var gender = ""
        try {
            var radioButtonChecked: RadioButton = findViewById(selectID)
            gender = radioButtonChecked.text as String
        }catch (t: Throwable){
            gender = ""
        }

        val intent = Intent ( this,SecondActivity::class.java)
        intent.putExtra("stdData",Employee(name.text.toString(),gender.toString(),email.text.toString(),Salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View) {
        name.text.clear()
        email.text.clear()
        radioGroup.clearCheck()
        Salary.text.clear()
    }
}
