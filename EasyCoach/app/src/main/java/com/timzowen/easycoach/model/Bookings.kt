package com.timzowen.easycoach.model

data class Bookings(
    val startDestination: String,
    val finalDestination: String,
    val bookingId: Int,
    val departureTime: String,
    val departureDate: String
)

fun pastTravels(): List<Bookings>{
    return listOf(
        Bookings("Nairobi", "Busia", 12345678, "09:00", "15-Jan-2025"),
        Bookings("Mombasa", "Nairobi", 22345679, "06:30", "16-Jan-2025"),
        Bookings("Kisumu", "Nakuru", 32345680, "12:00", "17-Jan-2025"),
        Bookings("Eldoret", "Kitale", 42345681, "08:15", "18-Jan-2025"),
        Bookings("Thika", "Nyeri", 52345682, "14:00", "19-Jan-2025"),
        Bookings("Machakos", "Makueni", 62345683, "10:45", "20-Jan-2025"),
        Bookings("Naivasha", "Kericho", 72345684, "07:30", "21-Jan-2025"),
        Bookings("Malindi", "Kilifi", 82345685, "11:00", "22-Jan-2025"),
        Bookings("Garissa", "Isiolo", 92345686, "13:00", "23-Jan-2025"),
        Bookings("Busia", "Nairobi", 12345687, "09:00", "24-Jan-2025"),
        Bookings("Nakuru", "Eldoret", 22345688, "06:00", "25-Jan-2025"),
        Bookings("Kitui", "Machakos", 32345689, "12:30", "26-Jan-2025"),
        Bookings("Kakamega", "Bungoma", 42345690, "15:15", "27-Jan-2025"),
        Bookings("Marsabit", "Isiolo", 52345691, "10:00", "28-Jan-2025"),
        Bookings("Voi", "Mombasa", 62345692, "07:45", "29-Jan-2025")
    )
}

