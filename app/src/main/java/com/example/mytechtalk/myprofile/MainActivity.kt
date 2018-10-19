package com.example.mytechtalk.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btneducation.setOnClickListener{

            Toast.makeText( this,"education",Toast.LENGTH_SHORT).show();
            var clickintent = Intent(this,Education::class.java)
            startActivity(clickintent)
        }
        work.setOnClickListener{
            Toast.makeText( this,"work",Toast.LENGTH_SHORT).show();
            var intent = Intent(this,Work::class.java)
            startActivity(intent)
        }
        imageView1.setOnClickListener {
            Toast.makeText( this,"Plz Wait",Toast.LENGTH_SHORT).show();
            var intent = Intent(this,photoprofile1::class.java)
            startActivity(intent)
        }
    }

}
