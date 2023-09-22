package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Constants.LOREM_IPSUM_SHORT
import com.aliyuolalekan.portfolio.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String,
    val rating: Float
) {
    First(
        image = Res.Image.avatar1,
        fullName = "Óscar Grande",
        profession = "Senior Android Engineer, FREENOW",
        review = "Pending",
        rating = 5.0F
    ),
    Second(
        image = Res.Image.avatar2,
        fullName = "Idris Adetunbi",
        profession = "Mobile Software Engineer, Trivago",
        review = "An exceptional, energetic software engineer",
        rating = 5.0F
    ),
    Third(
        image = Res.Image.avatar3,
        fullName = "Samira Badamestani",
        profession = "Senior Android Developer",
        review = "Pending",
        rating = 5.0F
    ),
    Fourth(
        image = Res.Image.avatar4,
        fullName = "Jessica Lorena",
        profession = "Senior Android Engineer FREENOW",
        review = "Pending",
        rating = 4.7F
    ),
    Fifth(
        image = Res.Image.avatar5,
        fullName = "Kola Emilola",
        profession = "Senior Android Engineer Trade Republic",
        review = "Pending",
        rating = 5.0F
    ),
    Sixth(
        image = Res.Image.avatar6,
        fullName = "Jannik Hell",
        profession = "Senior Software Engineer at FREENOW",
        review = "Pending",
        rating = 4.0F
    )
}