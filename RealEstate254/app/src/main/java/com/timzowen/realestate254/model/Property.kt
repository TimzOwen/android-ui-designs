package com.timzowen.realestate254.model

data class Property(
    val propertyId: Int,
    val propertyType: String,
    val propertyName: String,
    val propertyLocation: String,
    val propertyPrice: String,
    val propertyRating: Double,
    val propertyImgUrl: String,
)
