package com.example.contacttiles

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val familyFragment = FamilyFragment()
        val friendsFragment = FriendsFragment()
        val colleaguesFragment = ColleaguesFragment()
        val tutorsFragment = TutorsFragment()
        val staffFragment = StaffFragment()
        val employeeFragment = EmployeeFragment()


        var familyButton: Button = findViewById(R.id.familyBtn)
        var friendsButton: Button = findViewById(R.id.friendsBtn)
        var colleaguesButton: Button = findViewById(R.id.colleaguesBtn)
        var tutorsButton = findViewById<Button>(R.id.tutorBtn)
        var staffButton = findViewById<Button>(R.id.staffBtn)
        var employeeButton = findViewById<Button>(R.id.employeesBtn)

        familyButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, familyFragment)
                addToBackStack(null)
                commit()
            }
        }
        friendsButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, friendsFragment)
                addToBackStack(null)
                commit()
            }
        }
        colleaguesButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView3, colleaguesFragment)
                addToBackStack(null)
                commit()
            }
        }
        tutorsButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView4, tutorsFragment)
                addToBackStack(null)
                commit()
            }
        }
        staffButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView5, staffFragment)
                addToBackStack(null)
                commit()
            }
        }
        employeeButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView6, employeeFragment)
                addToBackStack(null)
                commit()
            }
        }
    }
}



