package com.aliyuolalekan.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.aliyuolalekan.portfolio.models.Section
import com.aliyuolalekan.portfolio.models.Theme
import com.aliyuolalekan.portfolio.util.Constants
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SectionTitle(
    section: Section,
    modifier: Modifier = Modifier,
    alignment: Alignment.Horizontal = Alignment.Start
) {
    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    ) {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(
                    if (alignment == Alignment.CenterHorizontally) TextAlign.Center
                    else TextAlign.Start
                )
                .margin(topBottom = 0.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(25.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .toAttrs()
        ) {
            Text(section.title)
        }

        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(
                    if (alignment == Alignment.CenterHorizontally) TextAlign.Center
                    else TextAlign.Start
                )
                .margin(bottom = 10.px, top = 0.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(40.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(section.subtitle)
        }
        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(r = 50.px)
        )
    }
}