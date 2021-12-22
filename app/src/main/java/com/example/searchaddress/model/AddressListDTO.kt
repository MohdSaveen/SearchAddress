package com.example.searchaddress.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AddressListDTO(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("addressString")
	val addressString: String? = null,

	@field:SerializedName("latitude")
	val latitude: Any? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("label")
	val label: String? = null,

	@field:SerializedName("priority")
	val priority: Int? = null
)