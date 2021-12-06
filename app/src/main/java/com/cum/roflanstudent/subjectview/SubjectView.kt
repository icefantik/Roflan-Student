package com.cum.roflanstudent.subjectview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cum.roflanstudent.R

class SubjectView(private var Subjects : Array<String>) : RecyclerView.Adapter<SubjectView.SubjectViewHolder>()
{
    inner class SubjectViewHolder(item : View) : RecyclerView.ViewHolder(item)
    {
        var subjectName : TextView? = null
        init {
            subjectName = item.findViewById(R.id.textViewSubjectName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.item_subject, parent, false)
        return SubjectViewHolder(item)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.subjectName?.text = Subjects[position]
    }

    override fun getItemCount(): Int = Subjects.size
}