package com.example.searchaddress.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.searchaddress.model.ResponseDTO
import com.example.searchaddress.repository.LocationsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocationsViewModel(private val locationsRepository: LocationsRepository) : ViewModel() {

    fun getLocations(stringQuery: String, city: String) {
        viewModelScope.launch(Dispatchers.IO) {
            locationsRepository.getLocations(stringQuery, city)
        }
    }

    val location:LiveData<ResponseDTO>
    get() = locationsRepository.location
}