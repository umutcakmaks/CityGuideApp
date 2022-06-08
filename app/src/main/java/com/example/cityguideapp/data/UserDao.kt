package com.example.cityguideapp.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.cityguideapp.model.User

@Dao
interface  UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Query("SELECT * FROM user_table ORDER BY uid ASC")
    fun readAllData(): LiveData<List<User>>

    @Query("SELECT * FROM user_table WHERE email=:email AND password=:password")
    fun findUserByEmailPassword(email: String, password: String) : LiveData<List<User>>

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("DELETE FROM user_table")
    suspend fun deleteAllUsers()

}