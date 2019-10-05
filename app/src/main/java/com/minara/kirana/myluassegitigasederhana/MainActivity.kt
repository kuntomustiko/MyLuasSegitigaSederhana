package com.minara.kirana.myluassegitigasederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit_main.setOnClickListener {

            // get inputan user
            val alas = edtAlas_main.text.toString()
            val tinggi = edtTinggi_main.text.toString()

            // check editText kosong apa engga
            if (alas.isNotEmpty() && tinggi.isNotEmpty()){

                // convert String to Double
                val convertAlas = alas.toDouble()
                val convertTinggi = tinggi.toDouble()

                // masukkan nilai ke rumus
                // 1/2 alas x tinggi
                val luasSegitiga = convertAlas.div(2).times(convertTinggi)

                // show alert
                showAlert("$luasSegitiga")
            } else{
                // show alert
                showAlert("Tidak boleh kosong")
            }
        }
    }

    private fun showAlert(msg : String){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Hasil Nilai Luas")
        alert.setMessage(msg)
        alert.show()
    }
}
