package com.international_presidential_school.fragments.localMoreData.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.international_presidential_school.models.localDataBase.PlanData

@Dao
interface PlanDao {
    //@Query("SELECT * FROM plan_of_student ORDER BY id DESC")
    @Query("SELECT * FROM plan_of_student  ORDER BY id DESC")
    fun getPlanData():List<PlanData>
    @Insert
    fun insert(planData: PlanData)

    @Query("DELETE FROM plan_of_student WHERE id = :id")
    fun delete(id: Int)


}