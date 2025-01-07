package com.example.first_task

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.first_task.api.RetrofitInstance
import com.example.first_task.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch users
        val apiService = RetrofitInstance.apiService
        apiService.getUsers().enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                if (response.isSuccessful) {
                    response.body()?.let { userResponse ->
                        Log.d("API_RESPONSE", "Users: ${userResponse.users}")
                    }
                } else {
                    Log.e("API_ERROR", "Error: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("API_FAILURE", "Error: ${t.message}")
            }
        })
    }
}
