package com.ulas.kotlintravelbook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ulas.kotlintravelbook.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}