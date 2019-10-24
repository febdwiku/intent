package com.example.intent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nim:EditText = findViewById(R.id.eTnim)
        val nama:EditText = findViewById(R.id.eTnama)
        val nilai:EditText = findViewById(R.id.eTnilai)


        btnProses.setOnClickListener(){
            intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nim_value",nim.getText().toString() )
            intent.putExtra("nama_value",nama.getText().toString() )
            intent.putExtra("nilai_value",nilai.getText().toString() )
            startActivity(intent)
        }
    }
}
