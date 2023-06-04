package com.adminpm.service

import com.adminpm.model.admin.AdminHome
import com.adminpm.model.admin.AdminHomeItem
import com.adminpm.model.admin.PostData
import com.adminpm.model.educator.EducatorRequest
import com.adminpm.model.educator.EducatorResponse
import com.adminpm.model.educator.EducatorsResponseGet
import com.adminpm.model.message.MessageResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitService {
    @Headers("Content-type:application/json")

    @POST("lesson")
    fun postEducatorAnnouncement(@Body educatorRequest: EducatorRequest): Call<EducatorResponse>

    @GET("lesson")
    fun getEducatorAnnouncement(): Call<EducatorsResponseGet>

    @POST("announcement")
    fun postAnnouncement(@Body postData: PostData): Call<AdminHomeItem>

    @GET("announcement")
    fun getAnnouncement(): Call<AdminHome>

    @GET("message")
    fun getMessage(): Call<MessageResponse>
}