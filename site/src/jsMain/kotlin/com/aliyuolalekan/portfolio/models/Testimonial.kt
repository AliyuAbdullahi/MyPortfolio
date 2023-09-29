package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String,
    val rating: Float
) {
    First(
        image = Res.Image.avatar5,
        fullName = "Kola Emilola",
        profession = "Senior Android Engineer, TRADE REPUBLIC",
        review = "I have had the pleasure of working directly with Aliyu for a couple of years, and I am incredibly appreciative of the time we worked together. Aliyu’s exceptional communication skills have been a cornerstone of our collaborative efforts. He has a remarkable ability to articulate complex technical concepts in a clear and concise manner. This proficiency not only aids in our day-to-day tasks but also fosters a healthy and efficient work environment. Aliyu’s eagerness to teach and share knowledge is truly commendable. He will go out of his way to ensure that everyone on the team is on the same page, readily offering guidance and support whenever needed. This not only accelerates our project timelines but also contributes to the professional growth of our entire team.",
        rating = 5.0F
    ),
    Second(
        image = Res.Image.avatar4,
        fullName = "Jessica Lorena",
        profession = "Senior Android Engineer FREENOW",
        review = "Working with Aliyu is an absolute pleasure. His unwavering commitment to staying at the forefront of the latest technologies, especially his passion for mastering Jetpack Compose, is truly remarkable. What sets him apart is not just his knowledge but his eagerness to share it with the team. He's always willing to teach and apply his expertise to our projects, ensuring that we're consistently ahead in adopting cutting-edge tech. With Aliyu on board, you can count on having the latest innovations at your fingertips, making teamwork both inspiring and effective.",
        rating = 4.7F
    ),
    Third(
        image = Res.Image.avatar3,
        fullName = "Samira Badamestani",
        profession = "Senior Android Developer, FREENOW",
        review = "I wanted to take a moment to express my sincere thanks for the incredible experience of working with you in our jetpack compose workgroup. Your expertise, guidance and willingness to share your knowledge have been invaluable to me. I've learned so much from you and I'm truly grateful for the opportunity.\n" +
                "I look forward to more collaborations in the future and contributing to growing together.",
        rating = 5.0F
    ),
    Fourth(
        image = Res.Image.avatar2,
        fullName = "Idris Adetunbi",
        profession = "Mobile Software Engineer, Trivago",
        review = "An exceptional, energetic software engineer",
        rating = 5.0F
    ),
    Fifth(
        image = Res.Image.avatar1,
        fullName = "Óscar Grande",
        profession = "Senior Android Engineer, FREENOW",
        review = "I've been lucky to work in the same team as Aliyu since I joined FREENOW. From the very beginning, he was always willing to lead initiatives such as the migration to Jetpack Compose, where he played a major role in creating the components of our Design System.\n" +
                "Aliyu has also the ability to communicate highly technical terms in a very simple way, which allows him to address a wide variety of both technical and product audiences.\n" +
                "Speaking from a purely Android point of view, Aliyu masters the ecosystem, so it can perform both purely frontend as well as business logic implementations.",
        rating = 5.0F
    ),
    Sixth(
        image = Res.Image.avatar6,
        fullName = "Anderson Armani",
        profession = "Senior Software Engineer at FREENOW",
        review = "",
        rating = 5.0F
    )
}