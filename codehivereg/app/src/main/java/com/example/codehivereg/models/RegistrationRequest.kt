package com.example.codehivereg.models

import com.google.gson.annotations.SerializedName

data class RegistrationRequest(
  var name: String,
  @SerializedName("phone_number") var phoneNumber: String,
  var email: String,
  var password: String,
  var nationality: String,
  @SerializedName("date_of_birth") var dateOfBirth: String
)
