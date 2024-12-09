package com.timzowen.easycoach.model

data class Driver(
    val firstName: String,
    val secondName: String,
    val vehicleType: String,
    val vehicleModel: String,
    val rating: Double,
    val assignedRoutes: List<String>,
    val licenseNumber: String,
    val vehicleRegNumber: String
)