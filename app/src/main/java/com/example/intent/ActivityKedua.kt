package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*


class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val nim3:TextView = findViewById(R.id.tVnim3)
        val nama3:TextView = findViewById(R.id.tVnama3)
        val nilai3:TextView = findViewById(R.id.tVnilai3)
        val nilai_huruf:TextView = findViewById(R.id.tVketerangan2)

        nim3.setText(intent.getStringExtra("nim_value"))
        nama3.setText(intent.getStringExtra("nama_value"))
        nilai3.setText(intent.getStringExtra("nilai_value"))


        var nilai_akhir:Int=0
        var keterangan:String=""

        nilai_akhir=(intent.getStringExtra("nilai_value").toInt())

        if (nilai_akhir >= 80 && nilai_akhir <=100 ){
            keterangan="A"
        }else if (nilai_akhir >= 60 && nilai_akhir <80){
            keterangan="B"
        }else if (nilai_akhir >= 40 && nilai_akhir <60){
            keterangan="C"
        }else if (nilai_akhir >= 20 && nilai_akhir <40){
            keterangan="D"
        }else if (nilai_akhir >= 0 && nilai_akhir <20){
            keterangan="C"
        }

        nilai_huruf.setText(keterangan)

        btnKembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
