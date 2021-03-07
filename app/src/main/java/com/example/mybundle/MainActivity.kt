package com.example.mybundle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*add_button.setOnClickListener{
            val v1 = first_input.text.toString().toDouble()
            val v2 = secont_input.text.toString().toDouble()
            val myIntentA1A2 = Intent(this@MainActivity, MainActivity2::class.java)

            val myBunddle = Bundle()
            myBunddle.putDouble("val1", v1)
            myBunddle.putDouble("val2", v2)

            myIntentA1A2.putExtras(myBunddle)
            startActivityForResult(myIntentA1A2, 101)
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 101 && resultCode == RESULT_OK)
        {
            val myResultBundle = data?.extras
            val myResult = myResultBundle?.getDouble("vresult")
            activityTV.text = "la somme est $myResult".
        }*/
        val  txtValue1 = findViewById<EditText>(R.id.first_input)
        val txtValue2 = findViewById<EditText>(R.id.secont_input)

        val btnAdd = findViewById<Button>(R.id.add_button)
        btnAdd.setOnClickListener {
            val v1 = txtValue1.text.toString().toDouble()
            val v2 = txtValue2.text.toString().toDouble()

            val myIntentA1A2 = Intent(this@MainActivity,
                MainActivity2::class.java)

            val myDataBundle = Bundle()

            myDataBundle.putDouble("val1", v1)
            myDataBundle.putDouble("val2", v2)


            myIntentA1A2.putExtras(myDataBundle)

            startActivityForResult(myIntentA1A2, 101)
    }

}}