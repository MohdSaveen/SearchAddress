package com.example.searchaddress.model

import com.example.searchaddress.model.AddressListDTO
import com.google.gson.annotations.SerializedName

data class DataDTO(

	@field:SerializedName("autoCompleteRequestString")
	val autoCompleteRequestString: String? = null,

	@field:SerializedName("focusWord")
	val focusWord: String? = null,

	@field:SerializedName("addressList")
	val addressList: List<AddressListDTO?>? = null,

	@field:SerializedName("totalFindByRSUHits")
	val totalFindByRSUHits: Int? = null,

	@field:SerializedName("totalNoRSUReturned")
	val totalNoRSUReturned: Int? = null
)