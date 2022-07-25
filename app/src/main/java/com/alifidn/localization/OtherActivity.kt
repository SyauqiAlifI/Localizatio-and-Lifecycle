package com.alifidn.localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.alifidn.localization.databinding.ActivityMainBinding
import com.alifidn.localization.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    /* private lateinit var binding: ActivityMainBinding */

    private var _binding: ActivityOtherBinding? = null
    private val binding get() = _binding as ActivityOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(this, "Boop ${getString(R.string.onCreateInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onCreate Info Main")

        _binding = ActivityOtherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* val btn = binding.btnmu

        btn.setOnClickListener {
            Toast.makeText(this, "Beep", Toast.LENGTH_SHORT).show()
        } */

        binding.btnmu.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Boop", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Boop ${getString(R.string.onStartInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onStart Info Other")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Boop ${getString(R.string.onResumeInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onResume Info Other")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Boop ${getString(R.string.onPauseInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onPause Info Other")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Boop ${getString(R.string.onStopInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onStop Info Other")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Boop ${getString(R.string.onDestroyInfo)} Other", Toast.LENGTH_SHORT).show()
        Log.d("Activity", "onDestroy Info Other")
    }
}