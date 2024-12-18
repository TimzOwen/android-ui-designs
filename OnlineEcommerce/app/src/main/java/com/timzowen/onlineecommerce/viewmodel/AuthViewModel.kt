package com.timzowen.onlineecommerce.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel(){
    var email = mutableStateOf("")
    var password = mutableStateOf("")
    var fullName = mutableStateOf("")

    fun onEmailChange(newMail: String){
        email.value = newMail
    }

    fun onPasswordChange(newPassword: String){
        password.value = newPassword
    }

    fun onFullNameChange(newNames: String){
        fullName.value = newNames
    }

    fun loginUser(){

    }

    fun signupUser(){

    }

}