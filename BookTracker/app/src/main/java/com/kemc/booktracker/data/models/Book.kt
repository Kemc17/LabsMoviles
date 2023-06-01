package com.kemc.booktracker.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity( tableName = "book_table")
data class Book(
    val title: String,
    @Ignore val authors: List<Author>,
    @Ignore val publisher: Publisher,
    val publicationYear: String,
    val pageCount: Int,
    val subject: String,
    val summary: String,
    val isbn: String
) {
    @PrimaryKey val id: Long = 0
}