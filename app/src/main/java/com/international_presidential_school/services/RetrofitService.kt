package com.international_presidential_school.services
import com.international_presidential_school.models.ratings.RatingData
import com.international_presidential_school.models.announce.HomeAnnounce
import com.international_presidential_school.models.educator.EducatorResponseGet
import com.international_presidential_school.models.rating.RatingRequest
import com.international_presidential_school.models.rating.RatingResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitService {

    @Headers("Content-type:application/json")

    @POST("rating")
    fun ratingPost(@Body ratingRequest: RatingRequest):Call<RatingResponse>

    @GET("rating")
    fun  ratingList():Call<RatingData>

    @GET("announcement")
    fun announcementList():Call<HomeAnnounce>

    @GET("lesson")
    fun getEducatorAnnouncement(): Call<EducatorResponseGet>


}