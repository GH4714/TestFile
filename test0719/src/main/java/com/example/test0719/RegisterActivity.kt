package com.example.test0719

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.test0719.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val binding = ActivityRegisterBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val id: String = binding.Inputid.text.toString()
            val pw: String = binding.Inputpw.text.toString()
            val name: String = binding.Inputname.text.toString()
            Log.d("lgh", "id의 값 : $id, pw의 값 : $pw, name의 값 : $name")
            Toast.makeText(this@RegisterActivity, "id의 값 : $id, pw의 값 : $pw", Toast.LENGTH_SHORT).show()
        }
    }
}