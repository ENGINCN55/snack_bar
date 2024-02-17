package com.example.snack_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snack_bar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnNormal.setOnClickListener{view ->//burada "view ->" yapısı ile btnNormal'i temsil ediyor
            Snackbar.make(view,"merhaba",Snackbar.LENGTH_LONG).show()
        }
        binding.btnGeriDonus.setOnClickListener{nesne->
            Snackbar.make(nesne,"Mesaj Silinsin mi?",Snackbar.LENGTH_LONG)
                //snackbar'a tıklanabilir "evet" yazdırdık
                .setAction("evet"){nesne2 ->
                    Snackbar.make(nesne2,"mesaj silindi",Snackbar.LENGTH_LONG).show()

                }
                .show()

        }
        binding.btnOzel.setOnClickListener {

        }

    }
}