package com.aliyuolalekan.portfolio.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.dom.ElementTarget
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.navigation.UndecoratedLinkVariant
import com.varabyte.kobweb.silk.components.overlay.PopupPlacement
import com.varabyte.kobweb.silk.components.overlay.Tooltip
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.addVariant
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.style.visited
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.toSilkPalette
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val NavHeaderStyle by ComponentStyle.base(extraModifiers = { SmoothColorStyle.toModifier() }) {
    Modifier
        .fillMaxWidth()
        .height(50.px)
        // Intentionally invert the header colors from the rest of the page
        .backgroundColor(colorMode.toSilkPalette().color)
}

val NavItemStyle by ComponentStyle {
    // Intentionally invert the header colors from the rest of the page
    val linkColor = colorMode.toSilkPalette().background

    base { Modifier.margin(leftRight = 15.px) }

    link { Modifier.color(linkColor) }
    visited { Modifier.color(linkColor) }
}

val NavButtonVariant by NavItemStyle.addVariant {
    base { Modifier.padding(0.px).borderRadius(50.percent) }
}

@Composable
private fun NavLink(path: String, text: String) {
    Link(path, text, NavItemStyle.toModifier(), UndecoratedLinkVariant)
}

@Composable
fun NavHeader() {
    var colorMode by ColorMode.currentState
    Box(NavHeaderStyle.toModifier()) {
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavLink("/", "HOME")
            NavLink("/about", "ABOUT")
            NavLink("/markdown", "MARKDOWN")
            Spacer()

            Button(
                onClick = { colorMode = colorMode.opposite },
                NavItemStyle.toModifier(NavButtonVariant)
            ) {
                Box(Modifier.margin(8.px)) {
                    when (colorMode) {
                        ColorMode.LIGHT -> FaMoon()
                        ColorMode.DARK -> FaSun()
                    }
                }
            }
            Tooltip(ElementTarget.PreviousSibling, "Toggle color mode", placement = PopupPlacement.BottomRight)
        }
    }
}
