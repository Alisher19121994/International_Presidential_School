package com.international_presidential_school.fragments.localMoreData.database



import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.international_presidential_school.models.localDataBase.PlanData

@Database(entities = [PlanData::class], version = 1)
abstract class PlanDatabase : RoomDatabase(){
    abstract fun planDao(): PlanDao
    companion object{
        private var INSTANCE: PlanDatabase? = null
        fun getInstance(context: Context): PlanDatabase?{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    PlanDatabase::class.java,
                    "Daily_plans"
                )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }

    }
}