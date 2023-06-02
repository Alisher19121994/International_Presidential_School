package com.international_presidential_school.fragments.localMoreData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.international_presidential_school.R
import com.international_presidential_school.fragments.localMoreData.database.PlanDatabase
import com.international_presidential_school.models.localDataBase.PlanData


class DailyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_daily, container, false)
        initViews(view)
        return view
    }
    private fun initViews(view: View) {
        val buttonSubmit = view.findViewById<AppCompatButton>(R.id.createPlanButton_main_id)
        buttonSubmit?.setOnClickListener {

            val titleEditTExt: EditText = view.findViewById(R.id.yourPlan_main_id)
            val descEditText: EditText = view.findViewById(R.id.planDescription_main_id)

            val textOfTitle = titleEditTExt.text.toString().trim()
            val textOfDesc = descEditText.text.toString().trim()
            val planData = PlanData(textOfTitle, textOfDesc)

            PlanDatabase.getInstance(requireContext())?.planDao()?.insert(planData)
            Toast.makeText(requireContext(), "Plan is saved", Toast.LENGTH_LONG).show()
    }
    }

}
