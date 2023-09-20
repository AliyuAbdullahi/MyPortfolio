package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Constants.LOREM_IPSUM_SHORTEST
import com.aliyuolalekan.portfolio.util.Res

enum class Service(
    val icon: String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Web(
        icon = Res.Icon.backend,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Backend(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "Backend Service",
        description = LOREM_IPSUM_SHORTEST
    )
}