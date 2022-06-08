package com.example.cityguideapp.repository

import androidx.lifecycle.LiveData
import com.example.cityguideapp.data.UserDao
import com.example.cityguideapp.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers(){
        userDao.deleteAllUsers()
    }

    fun findUserByEmailPassword(email: String, password: String) :LiveData<List<User>> {
        return userDao.findUserByEmailPassword(email, password)
    }

}