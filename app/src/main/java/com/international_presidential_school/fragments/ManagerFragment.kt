package com.international_presidential_school.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.international_presidential_school.R
import com.international_presidential_school.adapters.TimeManageAdapter
import com.international_presidential_school.fragments.localMoreData.database.PlanDatabase
import com.international_presidential_school.models.localDataBase.PlanData

class ManagerFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view =  inflater.inflate(R.layout.fragment_manager, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        recyclerView = view.findViewById(R.id.recycleTime_id)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        fetchData()
    }
    private fun fetchData() {
        val list = ArrayList<PlanData>()
        val data = PlanDatabase.getInstance(requireContext())?.planDao()?.getPlanData()
        for (i in 0 until data?.reversed()!!.size) {
            val goals = data[i]
            list.add(goals)
        }
        refreshData(list)
    }

    private fun refreshData(data:ArrayList<PlanData>) {
        val adapter = TimeManageAdapter(data)
        recyclerView.adapter = adapter
    }


}