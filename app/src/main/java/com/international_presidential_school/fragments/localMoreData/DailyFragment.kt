package com.international_presidential_school.fragments.localMoreData

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.international_presidential_school.R


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
//        goalList = ArrayList()
//        recyclerView = view.findViewById(R.id.recyclePlan_id)
//        recyclerView.layoutManager = LinearLayoutManager(requireContext())
//        goalAdapter = GoalAdapter(goalList, this)
//        recyclerView.adapter = goalAdapter
//
//
//        fetchData()
//        saveData(view)
//
//        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT) {
//            override fun onMove(
//                recyclerView: RecyclerView,
//                viewHolder: RecyclerView.ViewHolder,
//                target: RecyclerView.ViewHolder
//            ): Boolean {
//                return false
//            }
//            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//                val deletedGoal: GoalData = goalList[viewHolder.adapterPosition]
//                val position = viewHolder.adapterPosition
//                goalList.removeAt(viewHolder.adapterPosition)
//                deletedGoal.id?.let { delete ->
//                    AppDatabase.getInstance(requireContext())?.goalDao()?.delete(delete)
//                }
//
//
//                goalAdapter.notifyItemRemoved(viewHolder.adapterPosition)
//                Snackbar.make(
//                    recyclerView,
//                    "Deleted " + deletedGoal.goalNames,
//                    Snackbar.LENGTH_LONG
//                )
//                override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//                    val deletedGoal: GoalData = goalList[viewHolder.adapterPosition]
//                    val position = viewHolder.adapterPosition
//                    goalList.removeAt(viewHolder.adapterPosition)
//                    deletedGoal.id?.let { delete ->
//                        AppDatabase.getInstance(requireContext())?.goalDao()?.delete(delete)
//                    }
//
//
//                    goalAdapter.notifyItemRemoved(viewHolder.adapterPosition)
//                    Snackbar.make(
//                        recyclerView,
//                        "Deleted " + deletedGoal.goalNames,
//                        Snackbar.LENGTH_LONG
//                    )
//                }}}}
}

//    private fun fetchData() {
//        val data = AppDatabase.getInstance(requireContext())?.goalDao()?.getAll()
//        for (i in 0 until data?.reversed()!!.size) {
//            val goals = data[i]
//            goalAdapter.addGoals(goals)
//        }
//
//    }

//private fun saveData(view: View) {
//    val submitButton: AppCompatButton = view.findViewById(R.id.submitGoal_id)
//    submitButton.setOnClickListener {
//        val goalEditText: EditText = view.findViewById(R.id.goalField_id)
//        val textOfGoal = goalEditText.text.toString().trim()
//        val goalData = GoalData(textOfGoal)
//        goalAdapter.addGoals(goalData)
//        AppDatabase.getInstance(requireContext())?.goalDao()?.insert(goalData)
//        Toast.makeText(requireContext(), "Saved", Toast.LENGTH_LONG).show()
//    }
//}
}
