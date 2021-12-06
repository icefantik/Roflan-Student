package com.cum.roflanstudent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cum.roflanstudent.subjectview.SubjectView

class SchoolSubjects : AppCompatActivity() {
    private val subjects : Array<String> = arrayOf("Математика", "Геометрия", "Русский язык", "Литература", "Физкультура")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.school_subject)
        val recyclerViewSubject : RecyclerView = findViewById(R.id.recyclerViewSubject)
        recyclerViewSubject.layoutManager = LinearLayoutManager(this)
        recyclerViewSubject.adapter = SubjectView(subjects)
    }

    fun onClickBack(view: android.view.View) {
        val intent = Intent(this@SchoolSubjects, ProfileActivity::class.java)
        startActivity(intent)
    }
}