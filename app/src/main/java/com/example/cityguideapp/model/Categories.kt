package com.example.cityguideapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "categories_table")
data class Categories(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    val name: String,
    val description: String,
    val uimage: String,
    val color: String
) : Parcelable