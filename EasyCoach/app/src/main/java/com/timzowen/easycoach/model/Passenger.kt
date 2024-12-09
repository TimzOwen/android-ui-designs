package com.timzowen.easycoach.model

data class Passenger(
    val passengerName: String,
    val passengerSeatNo: String,
    val passengerPhoneNo: String,
    val passengerBoardingPoint: String,
    val passengerTravelDate: String,
    val passengerTotalFare: String
)

fun loadPassengerData(): List<Passenger>{
    return listOf(
        Passenger(
            "Alice Brown",
            "1A",
            "0712345678",
            "Nairobi",
            "2024-12-10",
            "2500"),
        Passenger(
            "Bob Smith",
            "1B",
            "0723456789",
            "Nakuru",
            "2024-12-11",
            "2500"),
        Passenger(
            "Carol White",
            "2A",
            "0734567890",

            "Kisumu",
            "2024-12-12",
            "2800"),
        Passenger(
            "David Johnson",
            "2B",
            "0745678901",
            "Kitale",
            "2024-12-13",
            "3000"),
        Passenger(
            "Emma Wilson",
            "3A",
            "0756789012",
            "Eldoret",
            "2024-12-14",
            "2700"),
        Passenger(
            "Franklin Lee",
            "3B",
            "0767890123",
            "Mombasa",
            "2024-12-15",
            "3200"),
        Passenger(
            "Grace Adams",
            "4A",
            "0778901234",
            "Machakos",
            "2024-12-16",
            "2400"),
        Passenger(
            "Hannah Green",
            "4B",
            "0789012345",
            "Thika",
            "2024-12-17",
            "2300"),
        Passenger(
            "Isaac Brown",
            "5A",
            "0790123456",
            "Naivasha",
            "2024-12-18",
            "2600"),
        Passenger(
            "Jack Carter",
            "5B",
            "0701234567",
            "Kericho",
            "2024-12-19",
            "3100"),
        Passenger(
            "Kate Moore",
            "6A",
            "0713456789",
            "Nyeri",
            "2024-12-20",
            "2200"),
        Passenger(
            "Leo Martin",
            "6B",
            "0724567890",
            "Kakamega",
            "2024-12-21",
            "2900"),
        Passenger(
            "Mary Hill",
            "7A",
            "0735678901",
            "Kisii",
            "2024-12-22",
            "2800"),
        Passenger(
            "Nathan Clark",
            "7B",
            "0746789012",
            "Voi",
            "2024-12-23",
            "3000"),
        Passenger("Olivia Scott",
            "8A",
            "0757890123",
            "Malindi",
            "2024-12-24",
            "3200")
    )
}