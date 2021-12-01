package com.bashir.marvel.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bashir.marvel.util.Constants

@Entity(tableName = Constants.CHARACTER_TABLE_NAME)
data class CharacterEntity (
    @PrimaryKey var id: Long?,
    var name: String?,
    var description: String?,
    var modified: String?,
    var imageUrl: String?
)