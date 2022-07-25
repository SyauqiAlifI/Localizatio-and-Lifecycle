package com.alifidn.localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.alifidn.localization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    /* private var _binding: ActivityMainBinding? = null
    *  private val binding get() = _binding as ActivityMainBinding */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Beep ${getString(R.string.onCreateInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onCreate Info Main")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* val btn = binding.btnme

        btn.setOnClickListener {
            Toast.makeText(this, "Beep", Toast.LENGTH_SHORT).show()
        } */

        binding.btnme.setOnClickListener {
            val intent = Intent(this, OtherActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Beep", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Beep ${getString(R.string.onStartInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onStart Info Main")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Beep ${getString(R.string.onResumeInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onResume Info Main")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Beep ${getString(R.string.onPauseInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onPause Info Main")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Beep ${getString(R.string.onStopInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onStop Info Main")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Beep ${getString(R.string.onDestroyInfo)} Main", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onDestroy Info Main")
    }
}