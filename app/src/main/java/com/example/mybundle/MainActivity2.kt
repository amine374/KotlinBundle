package com.example.mybundle

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2: AppCompatActivity(), View.OnClickListener
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
/*
        val myLocalIntent = intent
        val myBunddle = myLocalIntent.extras
        val v1 = myBunddle!!.getDouble("val1")
        val v2 = myBunddle!!.getDouble("val2")

        val result = v1 + v2
        dataRecieved.setText("     Données reçues sont val1 = $v1 et val2 = $v2   Reusltat  = $result")
        myBunddle.putDouble("Resultat", result)

        setResult(RESULT_OK, myLocalIntent).*/
        val dataReceived = findViewById<EditText>(R.id.dataRecieved)

        val btnDone = findViewById<Button>(R.id.btnDone)

        val myLocalIntent = intent
        val myBundle = myLocalIntent.extras
        val v1 = myBundle!!.getDouble("val1")
        val v2 = myBundle.getDouble("val2")


        val vResult = v1 + v2


        dataReceived.setText("    Données reçues sont    val1= $v1    val2= $v2     resultat= $vResult")

        myBundle.putDouble("vresult", vResult)

        myLocalIntent.putExtras(myBundle)

        setResult(RESULT_OK, myLocalIntent)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
        finish()
    }
}