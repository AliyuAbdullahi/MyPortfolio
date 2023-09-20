package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Constants.LOREM_IPSUM_SHORT
import com.aliyuolalekan.portfolio.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String
) {
    First(
        image = Res.Image.avatar1,
        fullName = "Kola Emilola",
        profession = "Web Designer",
        review = LOREM_IPSUM_SHORT
    ),
    Second(
        image = Res.Image.avatar2,
        fullName = "Samira",
        profession = "Android Developer",
        review = LOREM_IPSUM_SHORT
    ),
    Third(
        image = Res.Image.avatar3,
        fullName = "Christian Dehnin",
        profession = "Business Analyst",
        review = LOREM_IPSUM_SHORT
    ),
    Fourth(
        image = Res.Image.avatar4,
        fullName = "Idris",
        profession = "Top Manager",
        review = LOREM_IPSUM_SHORT
    ),
    Fifth(
        image = Res.Image.avatar5,
        fullName = "Oscar",
        profession = "HR Recruiter",
        review = LOREM_IPSUM_SHORT
    ),
    Sixth(
        image = Res.Image.avatar6,
        fullName = "Abdulkadri",
        profession = "Cyber Security Analyst",
        review = LOREM_IPSUM_SHORT
    )
}