package com.example.myandroidapplication.models

data class SignupModel(
    var userName: String = "",
    var email:  String = "",
    var password: String = "",
    var confirmPassword: String = "",
    var userId: String = ""
)
