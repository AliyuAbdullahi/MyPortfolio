package com.aliyuolalekan.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.aliyuolalekan.portfolio.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun RatingBar(modifier: Modifier = Modifier, rating: Float = 5.0F) {
    val count = rating.toInt()
    val hasOffset = (rating - count) > 0.1
    Row(modifier = modifier) {
        repeat(count) {
            Image(
                modifier = Modifier
                    .margin(right = if (hasOffset.not() && it != 4) 2.px else 4.px)
                    .size(16.px),
                src = Res.Icon.star
            )
        }
        if (hasOffset) {
            Image(
                modifier = Modifier
                    .margin(right = 2.px)
                    .size(16.px),
                src = Res.Icon.half_star
            )
        }
    }
}