package com.international_presidential_school.fragments.localMoreData

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.international_presidential_school.R
import java.util.Calendar

class TasksFragment : Fragment() {

    private lateinit var selectedDate: String
    private lateinit var selectedDate2: String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_tasks, container, false)
        initViews(view)
        return view
    }
    private fun initViews(view: View) {


        val textView = view.findViewById<TextView>(R.id.textView)
        val textView2 = view.findViewById<TextView>(R.id.textView2)
        val korsatiladiganJoy = view.findViewById<TextView>(R.id.korsatiladiganJoy)
        val korsatiladiganJoy2 = view.findViewById<TextView>(R.id.korsatiladiganJoy2)
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog = DatePickerDialog(requireContext(), { _, year, month, dayOfMonth ->

            selectedDate = "$dayOfMonth/${month + 1}/$year"

            korsatiladiganJoy.text = " $selectedDate"
        }, year, month, day)
    val datePickerDialog2 =
        android.app.DatePickerDialog(requireContext(), { _, year, month, dayOfMonth ->

            selectedDate2 = "$dayOfMonth/${month + 1}/$year"

            korsatiladiganJoy2.text = "$selectedDate2"
        }, year, month, day)


    textView.setOnClickListener {
        datePickerDialog.show()
    }
    textView2.setOnClickListener {
        datePickerDialog2.show()
    }

}
}