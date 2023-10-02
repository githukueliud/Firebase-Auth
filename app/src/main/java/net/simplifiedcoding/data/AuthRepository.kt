package net.simplifiedcoding.data

import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    val currentUser: FirebaseUser?  //this will get the user details to display
    suspend fun login(email:String, password: String): Resource<FirebaseUser>
    suspend fun signup(name: String, email: String, password: String): Resource<FirebaseUser>
    fun logout()
}