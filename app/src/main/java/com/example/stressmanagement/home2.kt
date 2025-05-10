package com.example.stressmanagement

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class home2 : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        // Find DrawerLayout and NavigationView
        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Setup Toolbar and Toggle Button
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Setup Drawer Toggle
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // Handle Navigation Clicks
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, home2::class.java))
                }
                R.id.analyze -> {
                    Toast.makeText(this, "Analyze", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, analytics::class.java))
                }
                R.id.notifcation -> {
                    Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, notifications::class.java))
                }
                R.id.user -> {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, profile::class.java))
                }
            }
            drawerLayout.closeDrawers() // Close Drawer after clicking
            true
        }

        // Ensure ImageButton works properly
        val button = findViewById<ImageButton>(R.id.imageButton)
        button.setOnClickListener {
            val intent = Intent(this, meditation::class.java)
            startActivity(intent)
        }

        val button1 = findViewById<ImageButton>(R.id.imageButton2)
        button1.setOnClickListener {
            val intent = Intent(this, aroma::class.java)
            startActivity(intent)
        }




    }

    // Ensure menu button works properly
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (toggle.onOptionsItemSelected(item)) true else super.onOptionsItemSelected(item)
    }


}
