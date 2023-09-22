package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Constants.ANDELA_ROLE
import com.aliyuolalekan.portfolio.util.Constants.FREE_NOW_ROLE
import com.aliyuolalekan.portfolio.util.Constants.HOLIDAY_PIRATES_ROLE

enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: String,
    val company: String,
    val from: String,
    val to: String
) {
    First(
        number = "01",
        jobPosition = "Senior Android Developer",
        description = HOLIDAY_PIRATES_ROLE,
        company = "Holiday Pirates",
        from = "June 2023",
        to = "NOW",
    ),
    Second(
        number = "02",
        jobPosition = "Software Engineer",
        description = FREE_NOW_ROLE,
        company = "FREE NOW",
        from = "March 2020",
        to = "June 2023",
    ),
    Third(
        number = "03",
        jobPosition = "Software Engineer | Senior Software Engineer",
        description = ANDELA_ROLE,
        company = "Andela",
        from = "March 2015",
        to = "February 2020",
    )
}