package com.example.searchaddress.model

import com.example.searchaddress.model.DataDTO
import com.google.gson.annotations.SerializedName

data class ResponseDTO(

	@field:SerializedName("requestId")
	val requestId: String? = null,

	@field:SerializedName("data")
	val data: DataDTO? = null
)