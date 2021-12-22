package com.example.searchaddress.api

import com.example.searchaddress.model.ResponseDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("/compassLocation/rest/address/autocomplete")
    suspend fun getAllPlaces(
        @Query("queryString") queryString: String,
        @Query("city") city: String
    ): Response<ResponseDTO>
}
