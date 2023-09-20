package com.aliyuolalekan.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.aliyuolalekan.portfolio.styles.SocialLinkStyle
import com.aliyuolalekan.portfolio.util.Constants.LINKED_IN_PROFILE
import com.aliyuolalekan.portfolio.util.Constants.TWITTER
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.minWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaTwitter
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar () {
    Column(
        modifier = Modifier.margin(right = 25.px)
            .padding(topBottom = 25.px)
            .minWidth(40.px)
            .borderRadius(r = 20.px)
            .backgroundColor(Colors.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialLinks()
    }
}

@Composable
private fun SocialLinks() {
    Link(
        path = TWITTER,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaTwitter(modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }

    Link(
        path = LINKED_IN_PROFILE,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(modifier = SocialLinkStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
}