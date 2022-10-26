package com.yusud.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //When
        println("---------------When---------------")

        val notRakami = 3
        var notMesaji = ""

        when(notRakami){

            0 -> notMesaji = "Kötü"
            1 -> notMesaji = "Kötünün İyisi"
            2 -> notMesaji = "İyinin Kötüsü"
            3 -> notMesaji = "Orta"
            4 -> notMesaji = "İyi"
            else -> notMesaji = "Çok İyi"
        }
        println(notMesaji)

    }
}