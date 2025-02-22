package com.example.first_task.models

data class UserResponse(
    val users: List<User>
)

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val maidenName: String?,
    val age: Int,
    val gender: String,
    val email: String,
    val phone: String,
    val username: String,
    val password: String,
    val birthDate: String,
    val image: String,
    val bloodGroup: String,
    val height: Double,
    val weight: Double,
    val eyeColor: String,
    val hair: Hair,
    val address: Address,
    val bank: Bank,
    val company: Company,
    val role: String
)

data class Hair(
    val color: String,
    val type: String
)

data class Address(
    val address: String,
    val city: String,
    val state: String,
    val stateCode: String,
    val postalCode: String,
    val coordinates: Coordinates,
    val country: String
)

data class Coordinates(
    val lat: Double,
    val lng: Double
)

data class Bank(
    val cardExpire: String,
    val cardNumber: String,
    val cardType: String,
    val currency: String,
    val iban: String
)

data class Company(
    val department: String,
    val name: String,
    val title: String,
    val address: Address
)
