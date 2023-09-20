package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Res

enum class Portfolio(
    val image: String,
    val title: String,
    val description: String,
    val link: String
) {
    One(
        image = Res.Image.portfolio1,
        title = "FREE NOW",
        description = "Android, iOS and Web Development",
        link = "https://play.google.com/store/apps/details?id=taxi.android.client&hl=en&gl=US"
    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Bleachers Report",
        description = "Android Developer",
        link = "https://play.google.com/store/apps/details?id=com.bleacherreport.android.teamstream&hl=en&gl=US"
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "Holiday Pirates",
        description = "Senior Android Developer",
        link = "https://play.google.com/store/apps/details?id=com.tippingcanoe.urlaubspiraten&hl=en_AU"
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Andela",
        description = "Android, Web, Backend and .Net Developer",
        link = "https://andela.com/"
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "Foursquare City Guide",
        description = "Android",
        link = "https://play.google.com/store/apps/details?id=com.joelapenna.foursquared&hl=en&gl=US"
    ),
    Six(
        image = Res.Image.portfolio5,
        title = "Pilgrim SDK",
        description = "Android, iOS, React Native",
        link = "https://location.foursquare.com/developer/docs/pilgrim-sdk-overview"
    )
}