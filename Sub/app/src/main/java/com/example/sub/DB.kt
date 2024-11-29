package com.example.sub

@Entity
data class Product(
    @PrimaryKey val id: String,
    val name: String,
    val price: Double
)