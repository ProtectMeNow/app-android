package com.example.protectmenow.view.telaprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.protectmenow.R
import com.example.protectmenow.databinding.ActivityTelaPrincipalBinding
import com.example.protectmenow.view.formlogin.FormLogin
import com.google.firebase.auth.FirebaseAuth

class TelaPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityTelaPrincipalBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btDeslogar.setOnClickListener {
            FirebaseAuth.getInstance().signOut()

            val voltarTelaLogin = Intent(this,FormLogin::class.java)
            startActivity(voltarTelaLogin)
            finish()
        }
    }
}