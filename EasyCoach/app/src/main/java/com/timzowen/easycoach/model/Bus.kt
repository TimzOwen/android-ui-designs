package com.timzowen.easycoach.model

data class Bus(
    val coachRouteName: String,
    val coachRegNumber: String,
    val coachDriver: String,
    val coachImage: String

)

fun loadBuses(): List<Bus> {
    return listOf(
        Bus(
            coachRouteName = "Nairobi - Nakuru - Kitale",
            coachRegNumber = "KDN 045L",
            coachDriver = "John Doe",
            coachImage = "https://businesstoday.co.ke/wp-content/uploads/2024/10/easy-coach.jpg"
        ),
        Bus(
            coachRouteName = "Nairobi - Uganda",
            coachRegNumber = "KCK 500J",
            coachDriver = "James Otieno",
            coachImage = "https://www.businesslist.co.ke/img/ke/g/1656513298-57-easy-coach-ltd-kapsabet.jpg"
        ),
        Bus(
            coachRouteName = "Mombasa - Nairobi",
            coachRegNumber = "KCY 789K",
            coachDriver = "Alice Muthoni",
            coachImage = "https://pbs.twimg.com/media/GJzxz83WcAEv-YN?format=jpg&name=large"
        ),
        Bus(
            coachRouteName = "Eldoret - Kisumu",
            coachRegNumber = "KDA 567P",
            coachDriver = "Peter Mwangi",
            coachImage = "https://swalanyeti.co.ke/storage/uploads/2023/08/Easy%20Coach-1692116112.jpeg"
        ),
        Bus(
            coachRouteName = "Kisumu - Kakamega",
            coachRegNumber = "KBR 234Q",
            coachDriver = "Sarah Wanjiku",
            coachImage = "https://businesstoday.co.ke/wp-content/uploads/2024/10/easy-coach.jpg"
        ),
        Bus(
            coachRouteName = "Nakuru - Naivasha",
            coachRegNumber = "KCN 120L",
            coachDriver = "Michael Otieno",
            coachImage = "https://easycoachkenya.com/assets/images/about/about2.webp"
        ),
        Bus(
            coachRouteName = "Nairobi - Nakuru - Kitale",
            coachRegNumber = "KDN 045L",
            coachDriver = "John Doe",
            coachImage = "https://businesstoday.co.ke/wp-content/uploads/2024/10/easy-coach.jpg"
        ),
        Bus(
            coachRouteName = "Nairobi - Uganda",
            coachRegNumber = "KCK 500J",
            coachDriver = "James Otieno",
            coachImage = "https://www.businesslist.co.ke/img/ke/g/1656513298-57-easy-coach-ltd-kapsabet.jpg"
        ),
        Bus(
            coachRouteName = "Mombasa - Nairobi",
            coachRegNumber = "KCY 789K",
            coachDriver = "Alice Muthoni",
            coachImage = "https://pbs.twimg.com/media/GJzxz83WcAEv-YN?format=jpg&name=large"
        ),
        Bus(
            coachRouteName = "Eldoret - Kisumu",
            coachRegNumber = "KDA 567P",
            coachDriver = "Peter Mwangi",
            coachImage = "https://swalanyeti.co.ke/storage/uploads/2023/08/Easy%20Coach-1692116112.jpeg"
        ),
        Bus(
            coachRouteName = "Kisumu - Kakamega",
            coachRegNumber = "KBR 234Q",
            coachDriver = "Sarah Wanjiku",
            coachImage = "https://businesstoday.co.ke/wp-content/uploads/2024/10/easy-coach.jpg"
        ),
        Bus(
            coachRouteName = "Nakuru - Naivasha",
            coachRegNumber = "KCN 120L",
            coachDriver = "Michael Otieno",
            coachImage = "https://easycoachkenya.com/assets/images/about/about2.webp"
        )

    )
}