package eu.tutorials.roomexample

import android.app.Application

class EmployeeApp: Application() {
    val db by lazy {
        EmployeeDB.getInstance(this)
    }
}