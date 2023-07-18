package ru.meeweel.mango.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ru.meeweel.mango.R
import ru.meeweel.mango.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setNavigation()
    }

    private fun setNavigation() {
        val fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main)
        val navHostFragment = fragment as NavHostFragment
        val navController = navHostFragment.navController
        binding.navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.navView.visibility = when (destination.id) {
                R.id.navigation_chat -> View.VISIBLE
                R.id.navigation_profile -> View.VISIBLE
                else -> View.GONE
            }
        }
    }
}