package com.example.crudapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee-table")
data class EmployeeEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String="",
    @ColumnInfo(name = "email-id")// internal reference is email-id
    val email: String = ""// this is for only user Reference
)
