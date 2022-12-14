package br.com.dio.navigation.navigation.component

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.dio.navigation.navigation.component.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}