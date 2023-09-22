package com.aliyuolalekan.portfolio.models

import com.aliyuolalekan.portfolio.util.Constants.ANDROID_DESCRIPTION
import com.aliyuolalekan.portfolio.util.Constants.BACKEND_SERVICE
import com.aliyuolalekan.portfolio.util.Constants.IOS_DESCRIPTION
import com.aliyuolalekan.portfolio.util.Constants.WEB_DEVELOPMENT
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
        description = ANDROID_DESCRIPTION
    ),
    IOS(
        icon = Res.Icon.apple,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = IOS_DESCRIPTION
    ),
    Web(
        icon = Res.Icon.backend,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = WEB_DEVELOPMENT
    ),
    Backend(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "Backend Service",
        description = BACKEND_SERVICE
    )
}