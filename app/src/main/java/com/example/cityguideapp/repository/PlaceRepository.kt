package com.example.cityguideapp.repository

import androidx.lifecycle.LiveData
import com.example.cityguideapp.data.PlaceDao
import com.example.cityguideapp.model.Place

class PlaceRepository(private val placeDao: PlaceDao) {

    val readAllDataPlace: LiveData<List<Place>> = placeDao.readAllDataPlace()

    val readAllDatPlaceWithFeature: LiveData<List<Place>> = placeDao.readAllDatPlaceWithFeature()

    suspend fun addPlace(place: Place) {
        placeDao.addPlace(place)
    }

    fun readAllPlaceByCategory(categoryId: Int) : LiveData<List<Place>> {
        return placeDao.readAllPlaceByCategory(categoryId)
    }

    fun searchPlace(search: String) : LiveData<List<Place>> {
        return placeDao.searchPlace(search)
    }

}