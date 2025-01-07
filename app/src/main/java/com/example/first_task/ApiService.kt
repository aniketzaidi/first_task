package com.example.first_task.api

import com.example.first_task.models.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    fun getUsers(): Call<UserResponse>
}
