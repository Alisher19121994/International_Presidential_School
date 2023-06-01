package com.international_presidential_school.models.localDataBase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Goals_of_Student")
class GoalData {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
    @ColumnInfo(name = "Goals_of_Student")
    var goalNames:String?=null

    constructor()
    constructor(goals:String?){
        this.goalNames = goals
    }
}