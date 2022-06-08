package com.example.cityguideapp.repository

import androidx.lifecycle.LiveData
import com.example.cityguideapp.data.CategoriesDao
import com.example.cityguideapp.model.Categories

class CategoriesRepository(private val categoriesDao: CategoriesDao) {

    val readAllDataCategory: LiveData<List<Categories>> = categoriesDao.readAllData()

    suspend fun addCategory(categories: Categories){
        categoriesDao.addCategory(categories)
    }

}