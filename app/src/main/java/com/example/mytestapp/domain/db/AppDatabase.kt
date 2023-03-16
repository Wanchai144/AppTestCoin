package com.example.mytestapp.domain.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mytestapp.data.model.room.CoinEntity
import com.example.mytestapp.data.source.remote.api.service.DataCoinDao
import com.example.mytestapp.utils.Const.DATABASE_VERSION

@Database(
    entities = [CoinEntity::class],
    version = DATABASE_VERSION
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dataCoinDao(): DataCoinDao
}

