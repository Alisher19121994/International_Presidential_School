package com.international_presidential_school.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.international_presidential_school.R
import com.international_presidential_school.activities.TimeManagementActivity
import com.international_presidential_school.models.rating.RatingRequest
import com.international_presidential_school.models.rating.RatingResponse
import com.international_presidential_school.services.RetrofitHTTP
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_more, container, false)
        initViews(view)
        return view
    }
    private fun initViews(view: View) {
        openPage(view)

    }
    private fun openPage(view: View) {
        val timeManage = view.findViewById<LinearLayout>(R.id.timeManagement)
        timeManage.setOnClickListener {
            val intent = Intent(requireContext(), TimeManagementActivity::class.java)
            startActivity(intent)
        }
        administration(view)
        director(view)
        employee(view)
    }
    private fun administration(view: View) {
        val administration = view.findViewById<LinearLayout>(R.id.adminstration)
        administration.setOnClickListener {
            //bottomSheetDialog(view)
        }
    }
    private fun director(view: View) {

        val director = view.findViewById<LinearLayout>(R.id.director)

        director.setOnClickListener {
           // bottomSheetDialog(view)
        }
    }
    private fun employee(view: View) {
        val teacher = view.findViewById<LinearLayout>(R.id.teacher)
        teacher.setOnClickListener {
            val bottomSheet = BottomSheetDialog(requireContext())
            bottomSheet.setContentView(R.layout.rating_dialog)

            val submit = bottomSheet.findViewById<AppCompatButton>(R.id.submitRating)
            submit?.setOnClickListener {

                val employeeName = bottomSheet.findViewById<EditText>(R.id.employee_name_ratings)
                val description = bottomSheet.findViewById<EditText>(R.id.description_ratings)
                val rating = bottomSheet.findViewById<EditText>(R.id.ratingBar_ratings)

                val getName = employeeName!!.text.toString().trim()
                val getDescription = description!!.text.toString().trim()
                val getRating = rating!!.text.toString().trim()


                val ratingRequest = RatingRequest(getName, getDescription,getRating,)

                val progressBar = bottomSheet.findViewById<ProgressBar>(R.id.progressBareee)
                progressBar!!.visibility = View.VISIBLE

                RetrofitHTTP.retrofitService().ratingPost(ratingRequest).enqueue(object :
                    Callback<RatingResponse> {
                    override fun onResponse(call: Call<RatingResponse>, response: Response<RatingResponse>) {
                        progressBar.visibility = View.GONE

                        if (response.isSuccessful) {
//                            val intent = Intent(requireContext(),RatingFragment::class.java)
//                            startActivity(intent)
                        }
                    }

                    override fun onFailure(call: Call<RatingResponse>, t: Throwable) {
                        progressBar.visibility = View.GONE
                    }
                })
            }
            bottomSheet.show()
        }
    }


}