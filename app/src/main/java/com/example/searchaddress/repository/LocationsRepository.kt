package com.example.searchaddress.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.searchaddress.api.RetrofitInterface
import com.example.searchaddress.model.ResponseDTO

class LocationsRepository(private val locationApi: RetrofitInterface) {
    private val locationsLiveData = MutableLiveData<ResponseDTO>()
    val location: LiveData<ResponseDTO>
        get() = locationsLiveData

    suspend fun getLocations(queryString: String, city: String) {
        val result = locationApi.getAllPlaces(queryString, city)
        if (result.body()!=null){
            locationsLiveData.postValue(result.body())
        }

    }

}